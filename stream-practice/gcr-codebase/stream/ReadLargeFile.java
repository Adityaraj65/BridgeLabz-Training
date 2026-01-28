package stream;

import java.io.*;

public class ReadLargeFile {

    public static void main(String[] args) {

        String fileName = "source.txt";

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader(fileName));

            String line;

            // read file line by line
            while ((line = br.readLine()) != null) {

                // check for word "error"
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

