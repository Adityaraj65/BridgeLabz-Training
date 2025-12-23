import java.util.Scanner;

public class FirstNonRepeatingChar{

    // Finds the first character that appears only once
    static char findFirstNonRepeatingCharacter(String text) {

        // Frequency array for all ASCII characters
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Find the first character with frequency = 1
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // No non-repeating character
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        char result = findFirstNonRepeatingCharacter(inputText);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        scanner.close();
    }
}

