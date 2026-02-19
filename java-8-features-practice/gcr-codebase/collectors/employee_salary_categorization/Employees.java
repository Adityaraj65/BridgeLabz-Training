package collectors.employee_salary_categorization;

class Employees {

    private String name;
    private String department;
    private double salary;
    public Employees(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
}

