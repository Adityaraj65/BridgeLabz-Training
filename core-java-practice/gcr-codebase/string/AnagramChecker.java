import java.util.Scanner;

public class AnagramChecker {

    // Method to check whether two texts are anagrams
    static boolean areTextsAnagrams(String firstText, String secondText) {

        // Step 1: If lengths are different, they cannot be anagrams
        if (firstText.length() != secondText.length()) {
            return false;
        }

        // Step 2: Frequency arrays for ASCII characters
        int[] frequencyFirst = new int[256];
        int[] frequencySecond = new int[256];

        // Step 3: Count character frequency for first text
        for (int i = 0; i < firstText.length(); i++) {
            char ch = firstText.charAt(i);
            frequencyFirst[ch]++;
        }

        // Step 4: Count character frequency for second text
        for (int i = 0; i < secondText.length(); i++) {
            char ch = secondText.charAt(i);
            frequencySecond[ch]++;
        }

        // Step 5: Compare both frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequencyFirst[i] != frequencySecond[i]) {
                return false;
            }
        }

        // All character frequencies matched
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first text: ");
        String firstText = scanner.nextLine();

        System.out.print("Enter second text: ");
        String secondText = scanner.nextLine();

        // Check anagram condition
        boolean result = areTextsAnagrams(firstText, secondText);

        // Display result
        if (result) {
            System.out.println("The given texts are ANAGRAMS.");
        } else {
            System.out.println("The given texts are NOT anagrams.");
        }

        scanner.close();
    }
}

