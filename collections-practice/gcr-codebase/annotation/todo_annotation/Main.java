package annotation.todo_annotation;
import java.lang.reflect.Method;
// Main class to read Todo annotations using Reflection
public class Main {
    public static void main(String[] args) {

        // Getting Class object
        Class<ProjectTasks> cls = ProjectTasks.class;

        // Looping through all methods
        for (Method method : cls.getDeclaredMethods()) {

            // Checking if method has @Todo annotation
            if (method.isAnnotationPresent(Todo.class)) {

                // Getting annotation details
                Todo todo = method.getAnnotation(Todo.class);

                // Printing pending task details
                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("---------------------------");
            }
        }
    }
}
