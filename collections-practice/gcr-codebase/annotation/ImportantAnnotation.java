package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Custom annotation to mark important methods
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD)          // Can be applied only on methods
@interface ImportantMethod {

    // Optional level parameter with default value
    String level() default "HIGH";
}

// Class where annotation is used
class Service {

    // Method marked as important with default level
    @ImportantMethod
    public void saveData() {
        System.out.println("Saving data");
    }

    // Method marked as important with custom level
    @ImportantMethod(level = "MEDIUM")
    public void loadData() {
        System.out.println("Loading data");
    }

    // Normal method without annotation
    public void helperMethod() {
        System.out.println("Helper method");
    }
}

// Main class to read annotations using Reflection
public class ImportantAnnotation {
    public static void main(String[] args) {

        // Getting Class object
        Class<Service> cls = Service.class;

        // Looping through all methods of the class
        for (Method method : cls.getDeclaredMethods()) {

            // Checking if method has ImportantMethod annotation
            if (method.isAnnotationPresent(ImportantMethod.class)) {

                // Getting annotation details
                ImportantMethod imp = method.getAnnotation(ImportantMethod.class);

                // Printing method name and importance level
                System.out.println(
                        "Method: " + method.getName() +
                                ", Level: " + imp.level()
                );
            }
        }
    }
}

