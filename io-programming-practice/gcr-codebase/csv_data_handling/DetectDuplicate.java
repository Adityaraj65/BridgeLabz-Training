package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
public class DetectDuplicate {
    public static void main(String[] args) {

        String filePath = "F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\LargeFile.csv";
        String line;
        HashSet<Integer> set = new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            // header skip
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                if (!set.add(id)) {
                    System.out.println("Duplicate record found: " + line);
                }
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

