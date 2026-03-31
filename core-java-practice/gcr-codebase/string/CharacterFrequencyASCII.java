import java.util.Scanner;

public class CharacterFrequencyASCII {

    // Finds frequency of characters using ASCII logic
    static String[][] findCharacterFrequency(String text) {

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Store result in 2D array
        String[][] result = new String[text.length()][2];
        int index = 0;

        // Store unique characters and their frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (frequency[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                frequency[ch] = 0; // Avoid recounting
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        String[][] frequencyTable = findCharacterFrequency(inputText);

        System.out.println("\nCharacter\tFrequency");
        for (String[] row : frequencyTable) {
            if (row[0] != null) {
                System.out.println(row[0] + "\t\t" + row[1]);
            }
        }

        scanner.close();
    }
}
