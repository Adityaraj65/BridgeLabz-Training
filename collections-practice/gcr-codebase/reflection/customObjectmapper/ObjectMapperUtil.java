package reflection.customObjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {

    // Generic method to convert Map to Object
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

        try {
            // Step 1: Create object using no-arg constructor
            T obj = clazz.getConstructor().newInstance();

            // Step 2: Loop through map entries
            for (Map.Entry<String, Object> entry : properties.entrySet()) {

                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                // Step 3: Get field from class by name
                Field field = clazz.getDeclaredField(fieldName);

                // Step 4: Allow access to private field
                field.setAccessible(true);

                // Step 5: Set value to field
                field.set(obj, fieldValue);
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException("Error while mapping object", e);
        }
    }
}

