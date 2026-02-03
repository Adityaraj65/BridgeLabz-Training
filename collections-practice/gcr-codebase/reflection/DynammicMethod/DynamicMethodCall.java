package reflection.DynammicMethod;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodCall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Load class
            Class<?> cls = Class.forName("reflection.DynammicMethod.MathOperation");

            // Create object dynamically
            Object obj = cls.getConstructor().newInstance();

            // Take method name from user
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = sc.nextLine();

            // Take input values
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            // Get method dynamically
            Method method = cls.getMethod(methodName, int.class, int.class);
            // Invoke method
            Object result = method.invoke(obj, a, b);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: Invalid method name or parameters");
        }

        sc.close();
    }
}
