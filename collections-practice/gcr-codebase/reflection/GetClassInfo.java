package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInfo {

    public static void main(String[] args) {

        // Take class name from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        try {
            // Load the class
            Class c = Class.forName(className);

            // Print class name
            System.out.println("\nClass Name: " + c.getName());

            // Print fields
            System.out.println("\nFields:");
            Field[] fields = c.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i]);
            }

            // Print constructors
            System.out.println("\nConstructors:");
            Constructor[] cons = c.getDeclaredConstructors();
            for (int i = 0; i < cons.length; i++) {
                System.out.println(cons[i]);
            }

            // Print methods
            System.out.println("\nMethods:");
            Method[] methods = c.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i]);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }

        sc.close();
    }
}

