import java.util.Scanner;

public class LowerCaseConversion {

    // Converts text to lowercase using charAt() and ASCII logic
    static String convertTextToLowercase(String text) {
        String convertedText = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // If character is uppercase, convert to lowercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar = (char) (currentChar + 32);
            }

            convertedText = convertedText + currentChar;
        }
        return convertedText;
    }

    // Compares two strings character by character
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

        // Taking complete text input
        System.out.print("Enter complete text: ");
        String originalText = scanner.nextLine();

        // Manual lowercase conversion
        String manualLowercase = convertTextToLowercase(originalText);

        // Built-in lowercase conversion
        String builtInLowercase = originalText.toLowerCase();

        // Comparing both results
        boolean isSame = compareStringsUsingCharAt(manualLowercase, builtInLowercase);

        // Display results
        System.out.println("Manual Lowercase   : " + manualLowercase);
        System.out.println("Built-in Lowercase : " + builtInLowercase);
        System.out.println("Both results same  : " + isSame);

        scanner.close();
    }
}
