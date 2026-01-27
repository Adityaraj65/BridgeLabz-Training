package exceptions;

import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    // Method that validates age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age is valid. You are eligible.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Take user input
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Validate age
            validateAge(age);

        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.out.println("Age must be 18 or above");

        } finally {
            sc.close();
        }
    }
}

