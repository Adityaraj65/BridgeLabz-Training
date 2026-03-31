import java.util.Scanner;

public class HarshadNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input number
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // calling method to count digits
        int count = countDigits(number);

        // calling method to store digits in array
        int[] digits = storeDigits(number, count);

        // calling method to find sum of digits
        int sum = sumOfDigits(digits);

        // calling method to find sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);

        // calling method to check harshad number
        boolean isHarshad = isHarshadNumber(number, sum);

        // calling method to find digit frequency
        int[][] frequency = findDigitFrequency(digits);

        // displaying results
        System.out.println("\nTotal digits : " + count);
        System.out.println("Sum of digits : " + sum);
        System.out.println("Sum of squares of digits : " + sumOfSquares);
        System.out.println("Is Harshad Number : " + isHarshad);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }

        sc.close();
    }

    // method to find count of digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // method to store digits of number in array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    // method to find sum of squares of digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    // method to check harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // method to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // initializing digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // counting frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }

        return frequency;
    }
}
