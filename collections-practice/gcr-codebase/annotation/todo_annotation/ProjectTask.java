package annotation.todo_annotation;
// Class where @Todo annotation is used
class ProjectTasks {

    // Pending task with default priority
    @Todo(task = "Implement login feature", assignedTo = "Aditya")
    public void loginFeature() {
        System.out.println("Login feature");
    }

    // Pending task with custom priority
    @Todo(task = "Optimize database queries", assignedTo = "Rahul", priority = "HIGH")
    public void optimizeDatabase() {
        System.out.println("Database optimization");
    }

    // Method without Todo annotation
    public void helperMethod() {
        System.out.println("Helper method");
    }
}
