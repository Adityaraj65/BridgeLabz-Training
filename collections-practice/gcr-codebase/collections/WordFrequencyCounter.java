package collections;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static Map<String, Integer> countWordFrequency(String filePath) throws IOException {

        Map<String, Integer> frequencyMap = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {

            // Normalize case and remove punctuation
            line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

            // Split into words
            String[] words = line.split("\\s+");

            for (String word : words) {
                if (word.isEmpty()) continue;

                frequencyMap.put(
                        word,
                        frequencyMap.getOrDefault(word, 0) + 1
                );
            }
        }

        reader.close();
        return frequencyMap;
    }

    public static void main(String[] args) throws IOException {

        String filePath = ""; // path to text file
        Map<String, Integer> result = countWordFrequency(filePath);

        System.out.println(result);
    }
}
