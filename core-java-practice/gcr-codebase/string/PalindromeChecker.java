import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare characters from start and end
    static boolean isPalindromeUsingIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Reverse string using charAt()
    static char[] reverseString(String text) {

        char[] reversed = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[index++] = text.charAt(i);
        }
        return reversed;
    }

    // Logic 3: Compare original and reversed arrays
    static boolean isPalindromeUsingArrays(String text) {

        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        System.out.println("Palindrome (Logic 1): " +
                isPalindromeUsingIndexes(inputText));
        System.out.println("Palindrome (Logic 2): " +
                isPalindromeRecursive(inputText, 0, inputText.length() - 1));
        System.out.println("Palindrome (Logic 3): " +
                isPalindromeUsingArrays(inputText));

        scanner.close();
    }
}

