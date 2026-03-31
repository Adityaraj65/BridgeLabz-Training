package reflection.dependencies_injenction;

import java.lang.reflect.Field;

public class SimpleDIContainer {

    // Generic method to create object and inject dependencies
    public static <T> T createObject(Class<T> clazz) {
        try {
            // Step 1: Create object of given class
            T obj = clazz.getConstructor().newInstance();

            // Step 2: Scan all declared fields
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {

                // Step 3: Check if field has @Inject
                if (field.isAnnotationPresent(Inject.class)) {

                    // Step 4: Create dependency object
                    Class<?> fieldType = field.getType();
                    Object dependency = fieldType.getConstructor().newInstance();

                    // Step 5: Inject dependency
                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException("DI failed", e);
        }
    }
}

