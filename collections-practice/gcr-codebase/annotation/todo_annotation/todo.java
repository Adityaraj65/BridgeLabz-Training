package annotation.todo_annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Custom annotation to mark pending tasks
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD)          // Can be applied only on methods
@interface Todo {

    // Description of the pending task
    String task();

    // Developer responsible for the task
    String assignedTo();

    // Priority with default value
    String priority() default "MEDIUM";
}
