import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess within a range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // Method to get user feedback
    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.nextLine().toLowerCase();
    }

    // Method to update the guessing range
    public static int[] updateRange(int guess, int low, int high, String feedback) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!isCorrect) {

            int guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Great! I guessed your number correctly.");
                isCorrect = true;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                int[] range = updateRange(guess, low, high, feedback);
                low = range[0];
                high = range[1];
            } else {
                System.out.println("Invalid input.");
            }
        }

        sc.close();
    }
}

