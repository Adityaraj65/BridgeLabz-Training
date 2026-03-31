import java.util.Scanner;

public class CharacterRemover {

    // Method to remove all occurrences of a character
    public static String removeCharacter(String input, char characterToRemove) {
        String result = "";

        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) != characterToRemove) {
                result += input.charAt(index);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        System.out.print("Enter character to remove: ");
        char characterToRemove = scanner.next().charAt(0);

        System.out.println("Modified String: " + removeCharacter(input, characterToRemove));
        scanner.close();
    }
}
