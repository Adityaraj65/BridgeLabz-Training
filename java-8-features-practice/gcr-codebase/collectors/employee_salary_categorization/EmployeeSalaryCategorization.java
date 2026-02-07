package collectors.employee_salary_categorization;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rohit", "IT", 60000),
                new Employee("Anjali", "IT", 70000),
                new Employee("Aman", "HR", 45000),
                new Employee("Neha", "HR", 55000),
                new Employee("Karan", "Sales", 52000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        // Print result
        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " -> " + avgSalary)
        );
    }
}
