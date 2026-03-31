import java.util.Scanner;

public class SentenceFormatter {

    public static String formatSentence(String input) {

        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        // Step 1: Trim and remove extra spaces
        input = input.trim().replaceAll("\\s+", " ");

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Capitalize first letter of sentence
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            // If punctuation found, prepare for next sentence
            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;

                // Ensure exactly one space after punctuation
                if (i + 1 < input.length() && input.charAt(i + 1) != ' ') {
                    result.append(' ');
                }
            }
        }

        return result.toString().trim();
    }

    // Test the method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine();

        String output = formatSentence(input);

        System.out.println(output);
    }
}

