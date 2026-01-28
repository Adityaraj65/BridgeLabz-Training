package stream;
import java.io.*;
import java.util.*;

// Employee class must be Serializable
class Employee implements Serializable {

    int id;
    String name;
    String department;
    double salary;

    // constructor to set employee data
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // method to display employee details
    void display() {
        System.out.println(id + " | " + name + " | " + department + " | " + salary);
    }
}

public class Serialization {

    public static void main(String[] args) {

        // creating list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Rahul", "IT", 50000));
        employees.add(new Employee(2, "Anita", "HR", 45000));
        employees.add(new Employee(3, "Karan", "Finance", 60000));

        // serialization
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("employees.txt"));

            // writing employee list into file
            oos.writeObject(employees);

            oos.close();
            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving employees.");
            e.printStackTrace();
        }

        // Deserialization
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("employees.txt"));

            // reading employee list from file
            List<Employee> empList =
                    (List<Employee>) ois.readObject();

            ois.close();

            System.out.println("\nEmployees retrieved from file:");
            for (Employee emp : empList) {
                emp.display();
            }

        } catch (IOException e) {
            System.out.println("Error while reading employees.");
            e.printStackTrace(); //showing exception complete error detail.

        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
            e.printStackTrace();
        }
    }
}
