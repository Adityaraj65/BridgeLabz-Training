package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) {
        String filePath="F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\student.csv";
        String line;

        try{
            //BufferedReader to read data line by line
            //used FileReader to open csv file
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            //loop to read line by line
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                if(data[0].equals("ID")){
                    continue;
                }
                //converting data to int as data inside csv is string type
                int id=Integer.parseInt(data[0]);
                String name=data[1];
                int age=Integer.parseInt(data[2]);
                int marks=Integer.parseInt(data[3]);
                if(marks>80) {
                    System.out.println("Student ID   : " + id);
                    System.out.println("Student Name : " + name);
                    System.out.println("Age          : " + age);
                    System.out.println("Marks        : " + marks);
                    System.out.println("---------------------------");
                }
            }
            br.close();

        }catch(Exception e){
            e.printStackTrace();

        }
    }

}
