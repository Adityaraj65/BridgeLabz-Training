import java.util.Scanner;

public class SubstringOccurrenceCounter {

    // Method to count how many times a substring appears in a string
    public static int countSubstringOccurrences(String mainString, String subString) {
        int count = 0;

        // Loop through main string till substring length fits
        for (int i = 0; i <= mainString.length() - subString.length(); i++) {

            int matchIndex;

            // Compare each character of substring
            for (matchIndex = 0; matchIndex < subString.length(); matchIndex++) {
                if (mainString.charAt(i + matchIndex) != subString.charAt(matchIndex)) {
                    break; // mismatch found
                }
            }

            // If full substring matched
            if (matchIndex == subString.length()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter substring: ");
        String subString = scanner.nextLine();

        int result = countSubstringOccurrences(mainString, subString);
        System.out.println("Occurrences: " + result);

        scanner.close();
    }
}
