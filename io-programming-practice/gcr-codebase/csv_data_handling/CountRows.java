package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountRows {
    public static void main(String[] args) {
        String filepath="F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\employeeDetails.csv";
        String line;
        int count =0;
        try{
            BufferedReader br=new BufferedReader(new FileReader(filepath));

            while((line=br.readLine())!=null){
               count++;

            }
            br.close();
            System.out.println("total records excluding header "+count);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
