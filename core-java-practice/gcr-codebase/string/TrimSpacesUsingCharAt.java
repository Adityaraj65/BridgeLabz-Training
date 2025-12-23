import java.util.Scanner;

public class TrimSpacesUsingCharAt {

    // Method to find start and end index after trimming spaces
    static int[] findTrimIndexes(String text) {

        int startIndex = 0;
        int endIndex = text.length() - 1;

        // Trim leading spaces
        while (startIndex <= endIndex && text.charAt(startIndex) == ' ') {
            startIndex++;
        }

        // Trim trailing spaces
        while (endIndex >= startIndex && text.charAt(endIndex) == ' ') {
            endIndex--;
        }

        return new int[]{startIndex, endIndex};
    }

    // Method to create substring using charAt()
    static String createSubstringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStringsUsingCharAt(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking input with leading and trailing spaces
        System.out.print("Enter text with spaces: ");
        String inputText = scanner.nextLine();

        // Get trim indexes using custom method
        int[] indexes = findTrimIndexes(inputText);

        // Create trimmed string manually
        String manualTrimmedText =
                createSubstringUsingCharAt(inputText, indexes[0], indexes[1]);

        // Trim using built-in method
        String builtInTrimmedText = inputText.trim();

        // Compare both results
        boolean isSame =
                compareStringsUsingCharAt(manualTrimmedText, builtInTrimmedText);

        // Display results
        System.out.println("Manual Trimmed Text  : [" + manualTrimmedText + "]");
        System.out.println("Built-in Trimmed Text: [" + builtInTrimmedText + "]");
        System.out.println("Both results same    : " + isSame);

        scanner.close();
    }
}
