package algorithm_analysis;

import java.io.*;

public class FileReadingComparison {

    public static void main(String[] args) {

        File file = new File("dsa-practice/gcr-codebase/algorithm_analysis/sample.txt"); // use any large text file

        try {

            long start = System.nanoTime();
            FileReader fr = new FileReader(file);

            // Read character by character
            while (fr.read() != -1) { }
            fr.close();

            long fileReaderTime = System.nanoTime() - start;

            //input stream reader
            start = System.nanoTime();
            InputStreamReader isr =
                    new InputStreamReader(new FileInputStream(file));

            // Read bytes and convert to characters
            while (isr.read() != -1) { }
            isr.close();

            long inputStreamReaderTime = System.nanoTime() - start;

            // Print execution times
            System.out.println("FileReader Time: " + fileReaderTime + " ns");
            System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ns");

        } catch (IOException e) {
            System.out.println("File not found or error reading file");
        }
    }
}

