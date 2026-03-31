import java.util.Scanner;

public class StringSplitCompare {

    // Find length of string without using length()
    static int findStringLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    // Split text into words manually using charAt()
    static String[] splitTextManually(String text) {

        int length = findStringLength(text);
        int wordCount = 1;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        words[wordCount - 1] = text.substring(start);
        return words;
    }

    // Compare two string arrays
    static boolean compareStringArrays(String[] first, String[] second) {

        if (first.length != second.length)
            return false;

        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        // Manual split
        String[] manualWords = splitTextManually(inputText);

        // Built-in split
        String[] builtInWords = inputText.split(" ");

        // Compare results
        boolean result = compareStringArrays(manualWords, builtInWords);

        System.out.println("Manual split matches built-in split: " + result);

        scanner.close();
    }
}
