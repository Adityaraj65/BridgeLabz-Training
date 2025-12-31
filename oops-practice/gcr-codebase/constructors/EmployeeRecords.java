public class EmployeeRecords {

	public static void main(String[] args) {
        Manager mgr = new Manager(501, "IT", 80000);
        mgr.updateSalary(90000);
        mgr.displayManagerDetails();

	}

}
class EmployeeDetail {

    public int employeeID;
    protected String department;
    private double salary;

    EmployeeDetail(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends EmployeeDetail{

    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // public
        System.out.println("Department: " + department);  // protected
        System.out.println("Salary: ₹" + getSalary());     // private via method
    }
}

