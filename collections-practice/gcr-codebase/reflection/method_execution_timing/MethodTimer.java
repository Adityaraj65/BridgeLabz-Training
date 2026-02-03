package reflection.method_execution_timing;

import java.lang.reflect.Method;

public class MethodTimer {

    public static void main(String[] args) {

        try {
            // Load class
            Class<?> cls = Class.forName("reflection.method_execution_timing.Task");
            // Create object
            Object obj = cls.getConstructor().newInstance();
            // Get all declared methods
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                // Measure start time
                long startTime = System.nanoTime();
                // Invoke method
                method.invoke(obj);
                // Measure end time
                long endTime = System.nanoTime();
                // Calculate execution time
                long duration = endTime - startTime;
                System.out.println(
                        "Method: " + method.getName() +
                                " | Execution Time: " + duration + " ns"
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

