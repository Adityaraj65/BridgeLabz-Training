import java.util.Scanner;

public class PalindromeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input number
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // calling method to count digits
        int count = countDigits(number);

        // calling method to store digits in array
        int[] digits = storeDigits(number, count);

        // calling method to reverse digits array
        int[] reversedDigits = reverseDigitsArray(digits);

        // calling method to compare original and reversed array
        boolean isPalindrome = compareArrays(digits, reversedDigits);

        // calling method to check duck number
        boolean isDuck = isDuckNumber(digits);

        // displaying digits
        System.out.print("Digits : ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        // displaying reversed digits
        System.out.print("\nReversed Digits : ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i] + " ");
        }

        // displaying results
        System.out.println("\n\nIs Palindrome Number : " + isPalindrome);
        System.out.println("Is Duck Number : " + isDuck);

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

    // method to store digits in array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // method to reverse digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        int index = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[index++] = digits[i];
        }
        return reversed;
    }

    // method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // method to check duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}

