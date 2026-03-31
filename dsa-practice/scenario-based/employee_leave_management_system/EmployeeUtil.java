package employee_leave_management_system;

import java.util.*;

public class EmployeeUtil {

    private Map<String, Employee> employeeMap = new HashMap<>();
    private List<LeaveRequest> leaveRequests = new ArrayList<>();

    // add employee
    public void addEmployee(Employee e) {
        employeeMap.put(e.getEmployeeId(), e);
    }

    // add leave request
    public void addLeaveRequest(String empId, int leaveDays) {
        Employee emp = employeeMap.get(empId);

        if (emp == null) {
            System.out.println("Employee not found");
            return;
        }

        LeaveRequest request = new LeaveRequest(emp, leaveDays);
        leaveRequests.add(request);

        try {
            request.approve();
        } catch (InsufficientLeaveBalanceException e) {
            request.reject();
            System.out.println(e.getMessage());
        }
    }

    public void getLeaveDetails(String empId) {
        boolean found = false;

        for (LeaveRequest lr : leaveRequests) {
            if (lr.getEmployee().getEmployeeId().equals(empId)) {
                lr.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No leave records found for employee " + empId);
        }
    }
}
