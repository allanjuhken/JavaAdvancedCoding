package task11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskList {
    private List<Task> taskList;
    private Scanner sc;

    //constructor
    public TaskList() {
        this.taskList = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    // behaviours

    public void addTask() throws InvalidInputException {

        // promp and store required values
        // description
        System.out.println("Enter the task description: ");
        String desc = sc.nextLine().trim();
        if (desc.isEmpty()) {
            throw new InvalidInputException("Can't be empty");
        }

        // dueDate
        System.out.println("Enter the due date(dd.mm.yyyy): ");
        String dueDateString = sc.nextLine().trim();
        LocalDate dueDate = LocalDate.parse(dueDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy")) ;
        try {
            dueDate = LocalDate.parse(dueDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy")) ;
        } catch (Exception e) {
            throw new InvalidInputException("Invalid date format: format is dd.mm.yyyy");
        }

        // priority
        System.out.println("Enter a priority(1-5): ");
        String priorityString = sc.nextLine().trim();
        int priority;
        try {
            priority = Integer.parseInt(priorityString);
            // if the above conversion is successful then check
            // if the number is between the expected range
            if (priority < 1 || priority > 5) throw new InvalidInputException("priority must be between 1 and 5");
        } catch (NumberFormatException e) {
            // if the number fails then throw this
            throw new InvalidInputException("Invalid priority format. Must be between 1-5");
        }

        taskList.add(new Task(desc, dueDate, priority));
        System.out.println("task added successfully");

    }

    // completeTask
    public void completeTask() throws InvalidInputException {
        System.out.println("Enter task id: ");
        String idString = sc.nextLine().trim();
        int id;
        try {
            id = Integer.parseInt(idString);
            if (id < 1 || id > taskList.size())
                throw new InvalidInputException("Invalid task id . Id must be between 1 and");
        } catch (NumberFormatException e) {
            throw new InvalidInputException("invalid id format. MUst be between 1 and " + taskList.size());
        }
        taskList.get(id - 1).setComplete(true);
        System.out.println("Task marked as completed");

    }

    // show all tasks
    public void printAllTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No task to display");
        } else {
            taskList
                    .stream()
                    .sorted(Comparator.comparing(Task::getDueDate))
                    .forEach(System.out::println);
        }
    }

    // show all tasks that's
    public void printOverDue() {
        List<Task> overdueTasks = taskList.stream()
                .filter(task -> task.getDueDate().isBefore(LocalDate.now())) // filter out dates that are passed
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());
        if (overdueTasks.isEmpty()){
            System.out.println("No overdue tasks to display");
        } else {
            overdueTasks.forEach(System.out::println);
        }
    }
}
