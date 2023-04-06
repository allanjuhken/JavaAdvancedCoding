package task11;

import java.time.LocalDate;

public class Task {
    private String description;
    private LocalDate dueDate;
    private int priority;
    private boolean isComplete;

    //constructor with fields
    public Task(String description, LocalDate dueDate, int priority) {
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isComplete = false;
    }

//    public Task(String desc, LocalDate dueDate, int priority) {
//    }

    // getters / setters
    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isComplete() {
        return isComplete;
    }


    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                ", isComplete=" + isComplete +
                '}';
    }
}
