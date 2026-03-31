package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCsvFIle {
    public static void main(String[] args) {
        String inputFile ="F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\employeeDetails.csv";
        String outputFile = "F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\UpdatedEmployeeDetails.csv";
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter fw = new FileWriter(outputFile);
            //reading header
            line = br.readLine();
            fw.write(line + "\n"); // writing same header in new file

            // read data other than header
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                //if department is it then increase salary by 10percent
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // updated record added in new CSV
                fw.write(id + "," + name + "," + department + "," + (int) salary + "\n");
            }

            br.close();
            fw.close();

            System.out.println("Salary updated CSV file created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
