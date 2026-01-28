package stream;

import java.io.*;
public class UpperToLower {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // to read file
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            // to write file
            FileWriter fw = new FileWriter(outputFile);
            BufferedWriter bw = new BufferedWriter(fw);

            String line;

            // reading file line by line
            while ((line = br.readLine()) != null) {

                // converting line to lowercase
                line = line.toLowerCase();

                // write in output file
                bw.write(line);
                bw.newLine();
            }

            // resources close
            br.close();
            bw.close();

            System.out.println("File converted successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
