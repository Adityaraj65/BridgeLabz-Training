package annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Container annotation required for repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {

    // Description of the bug
    String description();
}

// Class where repeatable annotation is used
class TaskService {

    // Applying BugReport annotation multiple times
    @BugReport(description = "NullPointerException occurs on startup")
    @BugReport(description = "Performance issue when loading data")
    public void processTask() {
        System.out.println("Processing task");
    }
}

// Main class to read annotations using Reflection
public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {

        // Getting Class object
        Class<TaskService> cls = TaskService.class;

        // Getting the method with annotations
        Method method = cls.getMethod("processTask");

        // Retrieving all BugReport annotations
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        // Printing all bug descriptions
        for (BugReport bug : bugReports) {
            System.out.println("Bug: " + bug.description());
        }
    }
}

