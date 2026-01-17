package linear_and_binary_search;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderProblem {

    public static void main(String[] args) {

        // Scanner object to take file path from user
        Scanner sc = new Scanner(System.in);
        // Ask user for file path
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        // FileReader and BufferedReader references
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Create FileReader to read characters from file
            fr = new FileReader(filePath);

            // Wrap FileReader inside BufferedReader for efficient line reading
            br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle file not found or read errors
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                // Close BufferedReader and FileReader
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }

        sc.close();
    }
}

