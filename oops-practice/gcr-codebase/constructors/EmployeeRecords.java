public class EmployeeRecords {

	public static void main(String[] args) {
        // Create Manager object
        Manager mgr = new Manager(501, "IT", 80000);
        mgr.updateSalary(90000);
        mgr.displayManagerDetails();

	}

}
class EmployeeDetail {
    // instance variables with different access modifiers
    public int employeeID;
    protected String department;
    private double salary;
    // parameterized constructor
    EmployeeDetail(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    // method to modify private salary
    public void updateSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
// subclass Manager
class Manager extends EmployeeDetail{

    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
    // method to display manager details
    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // public
        System.out.println("Department: " + department);  // protected
        System.out.println("Salary: ₹" + getSalary());     // private via method
    }
}

