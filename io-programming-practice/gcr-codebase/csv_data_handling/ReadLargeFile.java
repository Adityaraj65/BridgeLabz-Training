package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeFile {
    private static final int CHUNK = 100;
    public static void main(String[] args) {
        String filePath = "F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\LargeFile.csv"; // path of 500MB+ CSV
        int totalRecordsProcessed = 0;
        // try-with-resources ensures file is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<String> list = new ArrayList<>(CHUNK);
            String line;
            while ((line = br.readLine()) != null) {
                // Add line to current chunk
                list.add(line);
                // If chunk size reaches 100, process it
                if (list.size() == CHUNK) {
                    processChunk(list);
                    totalRecordsProcessed += list.size();
                    System.out.println("Records processed so far: " + totalRecordsProcessed);
                    // Clear chunk to free memory
                    list.clear();
                }
            }
            // Process remaining lines (less than 100)
            if (!list.isEmpty()) {
                processChunk(list);
                totalRecordsProcessed += list.size();
            }
            System.out.println("Total records processed: " + totalRecordsProcessed);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // This method represents business logic
    private static void processChunk(List<String> lines) {
        System.out.println("Processing chunk of size: " + lines.size());
    }
}

