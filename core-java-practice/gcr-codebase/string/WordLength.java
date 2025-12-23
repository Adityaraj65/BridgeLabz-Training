import java.util.Scanner;

public class WordLength {

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

    // Split text into words manually
    static String[] splitTextManually(String text) {

        int length = findStringLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        String[] words = splitTextManually(inputText);
        String[][] resultTable = createWordLengthTable(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < resultTable.length; i++) {
            int length = Integer.parseInt(resultTable[i][1]);
            System.out.println(resultTable[i][0] + "\t" + length);
        }

        scanner.close();
    }
}
