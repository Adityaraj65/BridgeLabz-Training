import java.util.Scanner;

public class UniqueCharacters{

    // This method finds the length of a string without using length()
    static int findStringLength(String text) {
        int count = 0;

        // Keep accessing characters until exception occurs
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

    // This method finds all unique characters in the string
    static char[] findUniqueCharacters(String text) {

        int length = findStringLength(text);

        // Temporary array to store possible unique characters
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop picks each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop checks if the character appeared before
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, store it
            if (isUnique) {
                temp[uniqueCount++] = currentChar;
            }
        }

        // Create final array of exact size
        char[] uniqueCharacters = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = temp[i];
        }

        return uniqueCharacters;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(inputText);

        System.out.print("Unique Characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        scanner.close();
    }
}
