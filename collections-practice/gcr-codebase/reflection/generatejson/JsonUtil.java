package reflection.generatejson;

import java.lang.reflect.Field;

public class JsonUtil {

    // Method to convert object to JSON-like string
    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {

            Field field = fields[i];
            field.setAccessible(true); // allow access to private fields

            try {
                String fieldName = field.getName();
                Object fieldValue = field.get(obj);

                json.append("\"").append(fieldName).append("\":");

                // If value is String, wrap in quotes
                if (fieldValue instanceof String) {
                    json.append("\"").append(fieldValue).append("\"");
                } else {
                    json.append(fieldValue);
                }

                // Add comma except for last field
                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}

