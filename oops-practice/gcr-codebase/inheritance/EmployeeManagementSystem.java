package inheritance;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating instances of each employee subclass
        Employee e1 = new Manager("Ramesh", "M101", 10000, 5);
        Employee e2 = new Developer("Suresh", "D201", 15000, "Java");
        Employee e3 = new Intern("saket", "I301", 5000);
        // Displaying their details
        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
        
    }
}
// Base class
class Employee{
    String name;
    private String id;
    private int salary;
    Employee(String name,String id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
     public void displayDetails(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("Salary : "+salary);
     }
}
// Derived classes
class Manager extends Employee{
    int teamSize;

    Manager(String name, String id, int salary,int teamSize) {
        super(name, id, salary);
        this.teamSize=teamSize;
        
    }
      @Override
    public void displayDetails() {
        super.displayDetails();   // print common details
        System.out.println("Team Size : " + teamSize);
    }    

    

}
// Derived classes
class Developer extends Employee{
    String programmingLang;
    Developer(String name, String id, int salary,String programmingLang) {
        super(name, id, salary);
        this.programmingLang=programmingLang;

    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : " + programmingLang);
    }
    
}
// Derived classes
class Intern extends Employee {

    Intern(String name, String id, int salary) {
        super(name, id, salary);
    }
     @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role : Intern");
    }

}
