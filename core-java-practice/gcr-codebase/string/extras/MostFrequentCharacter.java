import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    public static char findMostFrequentCharacter(String input) {
        int[] frequencyArray = new int[256];

        // Count frequency of each character
        for (int index = 0; index < input.length(); index++) {
            frequencyArray[input.charAt(index)]++;
        }

        char mostFrequentChar = input.charAt(0);
        int maxFrequency = frequencyArray[mostFrequentChar];

        // Identify character with highest frequency
        for (int index = 1; index < input.length(); index++) {
            if (frequencyArray[input.charAt(index)] > maxFrequency) {
                maxFrequency = frequencyArray[input.charAt(index)];
                mostFrequentChar = input.charAt(index);
            }
        }
        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        System.out.println("Most Frequent Character: '" + findMostFrequentCharacter(input) + "'");
        scanner.close();
    }
}
