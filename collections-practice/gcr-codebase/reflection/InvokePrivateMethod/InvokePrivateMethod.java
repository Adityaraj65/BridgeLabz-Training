package reflection.InvokePrivateMethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {

    public static void main(String[] args) {

        try {
            Calculator cal = new Calculator();

            Class c = cal.getClass();

            // Get private method
            Method m = c.getDeclaredMethod("multiply", int.class, int.class);

            // Allow access
            m.setAccessible(true);

            // Invoke method
            int result = (int) m.invoke(cal, 5, 4);

            System.out.println("Result is: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

