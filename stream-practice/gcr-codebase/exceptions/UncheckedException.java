package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Ask user for input
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Perform division
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Division by zero
            System.out.println("Error: Cannot divide by zero");

        } catch (InputMismatchException e) {
            // Non-numeric input
            System.out.println("Error: Please enter valid numbers only");

        } finally {
            sc.close(); // close resource
        }
    }
}

