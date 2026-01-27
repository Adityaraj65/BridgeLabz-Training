package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        // try-with-resources ensures BufferedReader is auto-closed
        try (BufferedReader br = new BufferedReader(new FileReader("F:\\BridgeLabz-Training\\stream-practice\\gcr-codebase\\exceptions\\info.txt"))) {

            // Read first line from file
            String firstLine = br.readLine();
            System.out.println(firstLine);

        } catch (IOException e) {
            // Handles file not found & read errors
            System.out.println("Error reading file");
        }
    }
}

