import java.util.Scanner;

public class LargestSecondLargest {

    public static void main(String[] args) {

        // Creating scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking number input from user
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        // Extract digits and store them in array
        while (number != 0) {

            // Increase array size if it becomes full
            if (index == maxDigit) {

                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            int digit = number % 10;
            digits[index] = digit;

            index++;
            number = number / 10;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();
    }
}
