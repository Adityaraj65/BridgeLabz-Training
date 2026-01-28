package stream;

import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {

        String fileName = "source.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader(fileName));

            String line;

            // read file line by line
            while ((line = br.readLine()) != null) {

                // split line into words
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word,
                                wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            br.close();

            // sort words by frequency
            List<Map.Entry<String, Integer>> list =
                    new ArrayList<>(wordCount.entrySet());

            list.sort((a, b) -> b.getValue() - a.getValue());

            // print top 5 words
            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(list.get(i).getKey()
                        + " : " + list.get(i).getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

