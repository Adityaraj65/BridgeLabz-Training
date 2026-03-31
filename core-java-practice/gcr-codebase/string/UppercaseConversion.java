import java.util.Scanner;

public class UppercaseConversion {

    // Converts text to uppercase using charAt() and ASCII logic
    static String convertTextToUppercase(String text) {
        String convertedText = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // If character is lowercase, convert to uppercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                currentChar = (char) (currentChar - 32);
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

        // Manual uppercase conversion
        String manualUppercase = convertTextToUppercase(originalText);

        // Built-in uppercase conversion
        String builtInUppercase = originalText.toUpperCase();

        // Comparing both results
        boolean isSame = compareStringsUsingCharAt(manualUppercase, builtInUppercase);

        // Display results
        System.out.println("Manual Uppercase   : " + manualUppercase);
        System.out.println("Built-in Uppercase : " + builtInUppercase);
        System.out.println("Both results same  : " + isSame);

        scanner.close();
    }
}
