import java.util.Scanner;

public class ToggleCharacterCase {

    // Method to toggle case using ASCII values
    public static String toggleCase(String input) {
        String result = "";

        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);

            // If uppercase, convert to lowercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                result += (char) (currentChar + 32);
            }
            // If lowercase, convert to uppercase
            else if (currentChar >= 'a' && currentChar <= 'z') {
                result += (char) (currentChar - 32);
            }
            // Non-alphabet characters remain unchanged
            else {
                result += currentChar;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        System.out.println("Toggled String: " + toggleCase(input));
        scanner.close();
    }
}
