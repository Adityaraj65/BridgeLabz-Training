package functional_interfaces.length_checker;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {
        int maxLimit = 20;
        // Function to calculate length of a string
        Function<String, Integer> lengthCalculator =
                message -> message.length();
        String message1 = "Hello World";
        String message2 = "This message is too long";

        checkMessage(message1, maxLimit, lengthCalculator);
        checkMessage(message2, maxLimit, lengthCalculator);
    }

    // Method to check message length
    private static void checkMessage(String message,
                                     int maxLimit,
                                     Function<String, Integer> lengthCalculator) {

        int length = lengthCalculator.apply(message);

        if (length > maxLimit) {
            System.out.println("Message exceeds limit (" + length + " characters)");
        } else {
            System.out.println("message character is in limit");
        }
    }
}

