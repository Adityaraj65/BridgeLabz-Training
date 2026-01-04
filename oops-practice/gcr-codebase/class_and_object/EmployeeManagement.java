package class_and_object;

public class EmployeeManagement{
    public static void main(String args[]){
        Employee employee = new Employee("Rohan","1",50000);
        employee.display();
    }
}
class Employee{
    String name;
    String id;
    int salary;
    public Employee(String name, String id ,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee Name "+this.name);
        System.out.println("Employee id "+this.id);
        System.out.println("Employee Salary "+this.salary); 
    }
}