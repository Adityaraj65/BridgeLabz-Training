package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
class StudentData {

    String name;
    int age;
    int marks;
    String grade;

    public StudentData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class MergeCsvFiles {

    public static void main(String[] args) {

        String file1 = "F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\student2.csv";
        String file2 = "F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\student3.csv";
        String outputFile = "F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\students_merged.csv";

        HashMap<Integer, StudentData> map = new HashMap<>();
        String line;

        try {
            // Read first Csv
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            br1.readLine();
            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                map.put(id, new StudentData(name, age));
            }
            br1.close();
            // read second csv
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            br2.readLine(); // header skip
            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                int marks = Integer.parseInt(data[1]);
                String grade = data[2];
                // updating data of same id
                if (map.containsKey(id)) {
                    map.get(id).marks = marks;
                    map.get(id).grade = grade;
                }
            }
            br2.close();
            // write merged CSV
            FileWriter fw = new FileWriter(outputFile);
            fw.write("ID,Name,Age,Marks,Grade\n");
            for (int id : map.keySet()) {
                StudentData s = map.get(id);
                fw.write(id + "," + s.name + "," + s.age + "," + s.marks + "," + s.grade + "\n");
            }
            fw.close();
            System.out.println("CSV files merged successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

