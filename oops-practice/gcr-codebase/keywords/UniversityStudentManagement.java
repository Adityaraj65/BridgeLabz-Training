package keywords;

public class UniversityStudentManagement {
    public static void main(String[] args) {

        Student s1 = new Student("Hemashree", 101, "A");
        Student s2 = new Student("Sharmila", 102, "B");

        // Static method call
        Student.displayTotalStudents();

        // Display student details
        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();

        // Update grade using instanceof check
        s2.updateGrade("A");

        // Display updated details
        s2.displayStudentDetails();
    }
}

// Student class
class Student {

    // STATIC variables
    static String universityName = "Global University";
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private String grade;

    // FINAL variable
    private final int rollNumber;

    // Constructor using THIS
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // STATIC method
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Display method with INSTANCEOF
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid Student instance");
        }
    }

    // Update operation with INSTANCEOF
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Cannot update grade");
        }
    }
}

