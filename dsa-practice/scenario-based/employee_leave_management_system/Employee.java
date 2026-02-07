package employee_leave_management_system;

public class Employee {

    private String name;
    private String employeeId;
    private int balancedLeave;

    public Employee(String name, String employeeId, int balancedLeave) {
        this.name = name;
        this.employeeId = employeeId;
        this.balancedLeave = balancedLeave;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getBalancedLeave() {
        return balancedLeave;
    }

    public void updateBalancedLeave(int leave)
            throws InsufficientLeaveBalanceException {

        if (leave > balancedLeave) {
            throw new InsufficientLeaveBalanceException("Insufficient leave balance");
        }
        balancedLeave -= leave;
    }
}
