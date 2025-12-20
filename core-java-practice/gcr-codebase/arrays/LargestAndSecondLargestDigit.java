import java.util.Scanner;

public class LargestAndSecondLargestDigit {

    public static void main(String[] args) {

        // Creating scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking number input from user
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Index to store position in array
        int index = 0;

        // Extract digits from number and store in array
        while (number != 0 && index < maxDigit) {

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

        // Display the result
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();
    }
}
