package reflection.modify_staticfields;

import java.lang.reflect.Field;

public class ModifyStaticField {

    public static void main(String[] args) {

        try {
            // Load Configuration class
            Class<?> cls = Class.forName("reflection.modify_staticfields.Configuration");

            // Get the private static field
            Field field = cls.getDeclaredField("API_KEY");

            // Allow access to private field
            field.setAccessible(true);

            // Modify static field (object reference is null)
            field.set(null, "NEW_SECRET_KEY");

            // Print updated value
            System.out.println("Updated API_KEY: " + field.get(null));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

