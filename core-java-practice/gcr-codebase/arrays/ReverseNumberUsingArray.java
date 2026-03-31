import java.util.Scanner;

public class ReverseNumberUsingArray {

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

        int[] reverseDigits = new int[count];

        // Copy digits in reverse order
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Display reversed number
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

        sc.close();
    }
}
