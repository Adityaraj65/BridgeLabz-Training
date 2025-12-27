import java.util.Scanner;

public class LexicographicalStringComparison {

    // Method to compare two strings character by character
    public static int compareStrings(String first, String second) {
        int minimumLength = Math.min(first.length(), second.length());

        // Compare characters until mismatch is found
        for (int index = 0; index < minimumLength; index++) {
            if (first.charAt(index) != second.charAt(index)) {
                return first.charAt(index) - second.charAt(index);
            }
        }
        // If all characters matched, compare lengths
        return first.length() - second.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();

        int comparisonResult = compareStrings(firstString, secondString);

        if (comparisonResult < 0) {
            System.out.println(firstString + " comes before " + secondString);
        } else if (comparisonResult > 0) {
            System.out.println(secondString + " comes before " + firstString);
        } else {
            System.out.println("Both strings are equal");
        }

        scanner.close();
    }
}
