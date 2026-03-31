package reflection.AccesPrivateField;

import java.lang.reflect.Field;

public class AccessPrivateField {

    public static void main(String[] args) {

        try {
            // Create object
            Person p = new Person();

            // Get Class object
            Class c = p.getClass();

            // Get private field
            Field f = c.getDeclaredField("age");

            // Allow access to private field
            f.setAccessible(true);

            // Modify value
            f.set(p, 25);

            // Get value
            int value = (int) f.get(p);

            System.out.println("Age value is: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

