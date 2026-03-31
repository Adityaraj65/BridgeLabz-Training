package linear_and_binary_search;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordOccurrence {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for file path
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        // Ask user for the word to search
        System.out.print("Enter word to count: ");
        String targetWord = sc.nextLine();

        int count = 0; // Counter for word occurrences

        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Create FileReader to read file
            fr = new FileReader(filePath);

            // Wrap FileReader inside BufferedReader
            br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Split line into words using space as delimiter
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            // Print final count
            System.out.println("Occurrences of '" + targetWord + "': " + count);

        } catch (IOException e) {
            // Handle file-related exceptions
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                // Close resources
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }

        sc.close();
    }
}

