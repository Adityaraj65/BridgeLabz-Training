import java.util.Scanner;

public class CharacterTypeIdentifier {

    // Method to check whether a character is Vowel, Consonant, or Not a Letter
    static String getCharacterType(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check for vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check for consonant
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // If character is not an alphabet
        return "Not a Letter";
    }

    // Method to find vowels and consonants using charAt()
    // Returns a 2D array with character and its type
    static String[][] identifyCharacterTypes(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            result[i][0] = String.valueOf(currentChar);
            result[i][1] = getCharacterType(currentChar);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    static void displayCharacterTable(String[][] table) {

        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        // Identify character types
        String[][] characterDetails = identifyCharacterTypes(inputText);

        // Display result
        displayCharacterTable(characterDetails);

        scanner.close();
    }
}
