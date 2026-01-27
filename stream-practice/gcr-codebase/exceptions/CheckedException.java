package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {

        try {
            // Try to open and read the file
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // close resource

        } catch (IOException e) {
            // Handles FileNotFoundException and other IO issues
            System.out.println("File not found");
        }
    }
}

