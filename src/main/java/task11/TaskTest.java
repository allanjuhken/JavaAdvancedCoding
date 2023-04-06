package task11;

public class TaskTest {
    public static void main(String[] args) {
        try {
            TaskList tl= new TaskList();
            tl.addTask();
//            tl.addTask();
            tl.printAllTasks();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
