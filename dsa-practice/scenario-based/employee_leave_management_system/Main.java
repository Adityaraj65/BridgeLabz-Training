package employee_leave_management_system;

public class Main {
    public static void main(String[] args) {

        EmployeeUtil util = new EmployeeUtil();
        Employee e1 = new Employee("Aman", "100", 10);
        Employee e2 = new Employee("Shyam", "101", 5);
        util.addEmployee(e1);
        util.addEmployee(e2);
        util.addLeaveRequest("100", 2);   // approved
        util.addLeaveRequest("101", 6);   // rejected
        util.getLeaveDetails("100");
        util.getLeaveDetails("101");
    }
}
