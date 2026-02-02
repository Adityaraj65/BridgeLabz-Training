package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name to search employee details");
        String name=sc.nextLine();
        String filePath="F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\employeeDetails.csv";
        String line;

        try{
            //BufferedReader to read data line by line
            //used FileReader to open csv file
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            //loop to read line by line
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                if(data[1].equals(name)){
                    //converting data to int as data inside csv is string type
                    String department=data[2];
                    int salary=Integer.parseInt(data[3]);

                    //output
                    System.out.println("name :"+ name);
                    System.out.println("Department :"+department);
                    System.out.println("salary :"+salary);
                }else{
                    System.out.println("no such employee found");
                }

            }
            br.close();

        }catch(Exception e){
            e.printStackTrace();

        }
    }

}
