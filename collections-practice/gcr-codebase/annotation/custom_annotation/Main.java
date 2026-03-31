package annotation.custom_annotation;
import java.lang.reflect.Method;
// Main class to read annotation using Reflection
public class Main {
    public static void main(String[] args) throws Exception {

        // Creating object of TaskManager
        TaskManager manager = new TaskManager();

        // Getting Class object
        Class<?> cls = manager.getClass();

        // Getting method where annotation is applied
        Method method = cls.getMethod("completeTask");

        // Reading annotation details
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        // Printing annotation values
        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}
