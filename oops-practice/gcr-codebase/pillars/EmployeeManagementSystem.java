package pillars;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Polymorphism: Employee reference
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Aditya", 50000);
        Employee e2 = new PartTimeEmployee(102, "Rohit", 80, 300);

        e1.assignDepartment("IT");
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        // Polymorphic behavior
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }

}

// Interface
interface Department {
    void assignDepartment(String departmentName);

    String getDepartmentDetails();
}

// Abstract class
abstract class Employee implements Department {

    // Encapsulated fields
    private int employeeId;
    private String name;
    protected double baseSalary;
    private String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : ₹" + calculateSalary());
        System.out.println("----------------------------------");
    }

    // Interface methods
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Full-time employee
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double fixedSalary) {
        super(employeeId, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // fixed monthly salary
    }
}

// Part-time employee
class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
