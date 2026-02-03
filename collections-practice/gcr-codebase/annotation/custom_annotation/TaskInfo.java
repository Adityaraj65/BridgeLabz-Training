package annotation.custom_annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
// Custom annotation to store task information
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD)          // Can be used on methods
@interface TaskInfo {

    // Task priority
    String priority();

    // Person assigned to the task
    String assignedTo();
}
