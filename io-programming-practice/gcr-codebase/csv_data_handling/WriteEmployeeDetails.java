package csv_data_handling;

import java.io.FileWriter;

public class WriteEmployeeDetails {
    public static void main(String[] args) {
        String filePath="F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\employeeDetails.csv";
        try{
            FileWriter fw=new FileWriter(filePath);

            fw.write("ID,Name,Department,Salary\n");
            // employee records
            fw.write("201,Amit,IT,55000\n");
            fw.write("202,Riya,HR,48000\n");
            fw.write("203,John,Finance,62000\n");
            fw.write("204,Neha,Marketing,50000\n");
            fw.write("205,Rahul,IT,60000\n");
            fw.close();
            System.out.println("employe.csv file created successfully");


        }catch(Exception e ){
            e.printStackTrace();
        }
    }
}
