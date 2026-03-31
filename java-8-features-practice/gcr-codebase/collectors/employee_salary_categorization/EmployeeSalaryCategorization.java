package collectors.employee_salary_categorization;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employees> employees = Arrays.asList(
                new Employees("Rohit", "IT", 60000),
                new Employees("Anjali", "IT", 70000),
                new Employees("Aman", "HR", 45000),
                new Employees("Neha", "HR", 55000),
                new Employees("Karan", "Sales", 52000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingDouble(Employees::getSalary)));

        // Print result
        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " -> " + avgSalary)
        );
    }
}
