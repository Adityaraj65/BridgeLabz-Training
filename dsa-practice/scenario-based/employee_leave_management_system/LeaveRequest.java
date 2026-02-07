package employee_leave_management_system;

public class LeaveRequest {

    private Employee employee;
    private int leaveDays;
    private String status;
    public LeaveRequest(Employee employee, int leaveDays) {
        this.employee = employee;
        this.leaveDays = leaveDays;
        this.status = "PENDING";
    }
    public Employee getEmployee() {
        return employee;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
    public void approve() throws InsufficientLeaveBalanceException {
        employee.updateBalancedLeave(leaveDays);
        status = "APPROVED";
    }

    public void reject() {
        status = "REJECTED";
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Applied Leave Days: " + leaveDays);
        System.out.println("Leave Status: " + status);
        System.out.println("Remaining Leave Balance: " + employee.getBalancedLeave());
        System.out.println("-----------------------------------");
    }
}
