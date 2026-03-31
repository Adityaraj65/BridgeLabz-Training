package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    int id;
    String name;
    String department;
    int salary;
    public Employee(int id,String name,String department ,int salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
}
public class SortRecords {
    public static void main(String[] args) {
        String filePath="F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\employeeDetails.csv";
        String line;
        ArrayList<Employee> list=new ArrayList<>();
        try{
            BufferedReader br= new BufferedReader(new FileReader(filePath));
            br.readLine();
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                int id=Integer.parseInt(data[0]);
                String name = data[1];
                String dept = data[2];
                int salary = Integer.parseInt(data[3]);

                list.add(new Employee(id, name, dept, salary));
            }
            br.close();
            Collections.sort(list,new Comparator<Employee>(){
                public int compare(Employee e1,Employee e2){
                    return e2.salary-e1.salary;
                }
            });
            // Top 5 print
            System.out.println("Top 5 Highest Paid Employees:");
            System.out.println("-----------------------------");

            for (int i = 0; i < 5 && i < list.size(); i++) {
                Employee e = list.get(i);
                System.out.println(
                        e.id + " | " + e.name + " | " + e.department + " | " + e.salary
                );
            }

        }catch(Exception e){

        }
    }
}
