package inheritance;

public class SchoolSystem {
    public static void main(String[] args) {

        // Creating different people in the school
        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Amit", 16, "10th Grade");
        Staff staff = new Staff("Ramesh", 35, "Administration");

        // Showing role and details
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        student.displayRole();
        student.displayDetails();
        System.out.println();

        staff.displayRole();
        staff.displayDetails();
    }
}

// Common parent class for everyone in the school
class Person {

    // Basic details every person has
    String name;
    int age;

    // Setting name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Print common details
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Teacher is a type of Person
class Teacher extends Person1 {

    // Subject taught by teacher
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Describe the role
    void displayRole() {
        System.out.println("Role : Teacher");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject : " + subject);
    }
}

// Student is a type of Person
class Student extends Person1 {

    // Grade or class of student
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role : Student");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Grade : " + grade);
    }
}

// Staff is a type of Person
class Staff extends Person1 {

    // Department where staff works
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role : Staff");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department : " + department);
    }
}
