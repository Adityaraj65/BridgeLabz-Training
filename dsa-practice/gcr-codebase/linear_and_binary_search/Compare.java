package linear_and_binary_search;
import java.io.*;
import java.nio.charset.Charset;

public class Compare {

    public static void main(String[] args) throws Exception {

        int n = 1000000;

        // StringBuilder test
        long start1 = System.nanoTime();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb1.append("hello");
        }
        long end1 = System.nanoTime();

        // StringBuffer test
        long start2 = System.nanoTime();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb2.append("hello");
        }
        long end2 = System.nanoTime();

        System.out.println("StringBuilder time: " + (end1 - start1));
        System.out.println("StringBuffer time : " + (end2 - start2));

        // File path of large file
        String filePath = "sample.txt";

        // FileReader test
        long start3 = System.nanoTime();
        int count1 = countUsingFileReader(filePath);
        long end3 = System.nanoTime();

        // InputStreamReader test
        long start4 = System.nanoTime();
        int count2 = countUsingInputStreamReader(filePath);
        long end4 = System.nanoTime();

        System.out.println("FileReader word count       : " + count1);
        System.out.println("FileReader time             : " + (end3 - start3));

        System.out.println("InputStreamReader word count: " + count2);
        System.out.println("InputStreamReader time      : " + (end4 - start4));
    }

    // Count words using FileReader
    static int countUsingFileReader(String path) {

        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return count;
    }

    // Count words using InputStreamReader
    static int countUsingInputStreamReader(String path) {

        int count = 0;

        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }

            br.close();
            isr.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return count;
    }
}

