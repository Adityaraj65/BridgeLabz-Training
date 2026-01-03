public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Thamarai", 101, "Software Engineer");
        Employee emp2 = new Employee("Rohan", 102, "Project Manager");

        // Static method
        Employee.displayTotalEmployees();

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}

// Employee class
class Employee {

    // STATIC variables
    static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private String designation;

    // FINAL variable
    private final int id;

    // Constructor using THIS
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // STATIC method
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // INSTANCEOF usage
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid Employee instance");
        }
    }
}
