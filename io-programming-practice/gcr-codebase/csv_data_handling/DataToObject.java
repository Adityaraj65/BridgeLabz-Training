package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class Student{
    private String id;
    private String name;
    private int age;
    private double marks;
    Student(String id , String name,int age,double marks){
        this.id=id;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getMarks(){
        return marks;
    }
}
public class DataToObject {
    public static void main(String[] args) {
        String filePath = "F:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv_data_handling\\student.csv";
        String line;
        ArrayList<Student> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                double marks = Double.parseDouble(data[3]);

                list.add(new Student(id, name, age, marks));
            }
            br.close();
            System.out.println(" Student details :");
            System.out.println("-----------------------------");

            System.out.println("Student Details");
            System.out.println("--------------------------");

            for (Student s : list) {
                System.out.println(
                        s.getId() + " | " +
                                s.getName() + " | " +
                                s.getAge() + " | " +
                                s.getMarks()
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
