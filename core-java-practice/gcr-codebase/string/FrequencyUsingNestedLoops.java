import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    // Find frequency using nested loop approach
    static String[] findFrequency(String text) {

        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark duplicate
                }
            }
        }

        // Store results
        String[] result = new String[characters.length];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " : " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        String[] output = findFrequency(inputText);

        for (String s : output) {
            if (s != null) {
                System.out.println(s);
            }
        }

        scanner.close();
    }
}
