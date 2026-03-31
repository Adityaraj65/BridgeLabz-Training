import java.util.Scanner;

public class ParagraphAnalyzer {

    // Method to analyze text
    public static void analyzeText(String paragraph, String oldWord, String newWord) {

        // Edge case: null, empty, or only spaces
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty. Nothing to analyze.");
            return;
        }

        // Step 1: Normalize spaces
        String cleanedText = paragraph.trim().replaceAll("\\s+", " ");

        // Step 2: Split into words
        String[] words = cleanedText.split(" ");

        // Count words
        int wordCount = words.length;

        // Find longest word
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Step 3: Case-insensitive replacement
        String replacedText = cleanedText.replaceAll(
                "(?i)\\b" + oldWord + "\\b", newWord
        );

        // Output results
        System.out.println("Word Count     : " + wordCount);
        System.out.println("Longest Word   : " + longestWord);
        System.out.println("Updated Text   : " + replacedText);
    }

    // Test the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();
        analyzeText(paragraph, "powerful", "awesome");
    }
}

