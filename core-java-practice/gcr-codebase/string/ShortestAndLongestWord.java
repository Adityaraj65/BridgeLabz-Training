import java.util.Scanner;

public class ShortestAndLongestWord {

    // Find string length without using length()
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

        // Count words
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

    // Create 2D array of word and its length
    static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return table;
    }

    // Find shortest and longest word lengths
    static int[] findShortestAndLongest(String[][] table) {

        int shortest = Integer.parseInt(table[0][1]);
        int longest = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);

            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        String[] words = splitTextManually(inputText);
        String[][] wordLengthTable = createWordLengthTable(words);
        int[] result = findShortestAndLongest(wordLengthTable);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length : " + result[1]);

        scanner.close();
    }
}
