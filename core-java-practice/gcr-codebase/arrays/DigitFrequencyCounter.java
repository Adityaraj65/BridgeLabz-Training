import java.util.Scanner;

public class DigitFrequencyCounter {

    public static void main(String[] args) {

        // Creating scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking number input from user
        int number = sc.nextInt();

        int tempNumber = number;
        int count = 0;

        // Count number of digits
        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        // Store digits in array
        while (number != 0) {
            digits[index] = number % 10;
            index++;
            number = number / 10;
        }

        // Array to store frequency of digits 0 to 9
        int[] frequency = new int[10];

        // Calculate frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
