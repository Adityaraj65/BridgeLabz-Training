package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Annotation to mark methods for execution time logging
@Retention(RetentionPolicy.RUNTIME) // Needed at runtime
@Target(ElementType.METHOD)          // Can be applied only on methods
@interface LogExecutionTime {
}

// Class with methods whose execution time will be measured
class PerformanceTest {

    // First method with annotation
    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 100000; i++) {
            // simple loop to consume some time
        }
    }

    // Second method with annotation
    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 10000000; i++) {
            // bigger loop to consume more time
        }
    }
}

// Main class to measure execution time using reflection
public class LoggingAnnotation {
    public static void main(String[] args) throws Exception {

        // Creating object of the class
        PerformanceTest test = new PerformanceTest();

        // Getting Class object
        Class<?> cls = test.getClass();

        // Looping through all methods
        for (Method method : cls.getDeclaredMethods()) {

            // Checking if method has @LogExecutionTime annotation
            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                // Recording start time
                long startTime = System.nanoTime();

                // Invoking the method
                method.invoke(test);

                // Recording end time
                long endTime = System.nanoTime();

                // Calculating execution time
                long executionTime = endTime - startTime;

                // Printing result
                System.out.println(
                        "Method: " + method.getName() +
                                " | Execution Time: " + executionTime + " ns"
                );
            }
        }
    }
}

