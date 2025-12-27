import java.util.Scanner;

public class Anagram {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String first, String second) {

        // Length mismatch means not anagrams
        if (first.length() != second.length()) {
            return false;
        }

        int[] frequencyArray = new int[256];

        // Increase count for first string and decrease for second
        for (int index = 0; index < first.length(); index++) {
            frequencyArray[first.charAt(index)]++;
            frequencyArray[second.charAt(index)]--;
        }

        // Check if all counts are zero
        for (int value : frequencyArray) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();

        System.out.println(
            areAnagrams(firstString, secondString) ? "Anagrams" : "Not Anagrams"
        );

        scanner.close();
    }
}
