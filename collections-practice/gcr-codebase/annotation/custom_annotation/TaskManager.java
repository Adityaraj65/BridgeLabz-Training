package annotation.custom_annotation;

// Class where annotation is used
class TaskManager {

    // Applying custom annotation to this method
    @TaskInfo(priority = "High", assignedTo = "Aditya")
    public void completeTask() {
        System.out.println("Task is being completed");
    }
}