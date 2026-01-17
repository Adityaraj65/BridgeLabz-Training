package linear_and_binary_search;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ByteStreamToCharacterStream {

    public static void main(String[] args) {

        // Scanner to take file path from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        // Declare resources
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            // Create FileInputStream to read binary data
            fis = new FileInputStream(filePath);

            // Convert byte stream to character stream using UTF-8 charset
            isr = new InputStreamReader(fis, Charset.forName("UTF-8"));

            // Wrap InputStreamReader with BufferedReader
            br = new BufferedReader(isr);

            String line;

            // Read file line by line and print
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle file or encoding related errors
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                // Close all resources
                if (br != null) br.close();
                if (isr != null) isr.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Error closing resources");
            }
        }

        sc.close();
    }
}

