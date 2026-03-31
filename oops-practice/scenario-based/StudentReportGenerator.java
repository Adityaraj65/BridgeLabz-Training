import java.util.ArrayList;
import java.util.List;

/*
 * Custom exception for invalid marks
 */
class InvalidMarkException extends Exception {
    InvalidMarkException(String message) {
        super(message);
    }
}

/*
 * Represents one student and their marks
 */
class Student {

    private String name;
    private String[] subjects;
    private int[] marks;

    Student(String name, String[] subjects, int[] marks) {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    // Calculates average marks
    double calculateAverage() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return (double) total / marks.length;
    }

    // Assigns grade based on average
    String calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 80) return "A";
        if (avg >= 60) return "B";
        if (avg >= 40) return "C";
        return "Fail";
    }

    // Displays formatted report card
    void printReport() {
        System.out.println("Student Name : " + name);
        System.out.println("Subjects & Marks:");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("  " + subjects[i] + " : " + marks[i]);
        }

        System.out.printf("Average : %.2f%n", calculateAverage());
        System.out.println("Grade   : " + calculateGrade());
        System.out.println("----------------------------");
    }
}

/*
 * Manages multiple students
 */
class StudentReportManager {

    List<Student> students = new ArrayList<>();

    // Adds student after validating marks
    void addStudent(String name, String[] subjects, int[] marks)
            throws InvalidMarkException {

        if (subjects.length != marks.length) {
            throw new InvalidMarkException("Subjects and marks count mismatch");
        }

        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100");
            }
        }

        students.add(new Student(name, subjects, marks));
    }

    // Prints report cards of all students
    void generateReports() {
        for (Student s : students) {
            s.printReport();
        }
    }
}

/*
 * Main execution class
 */
public class StudentReportGenerator {

    public static void main(String[] args) {

        StudentReportManager manager = new StudentReportManager();

        String[] subjects = {"Maths", "Science", "English"};

        try {
            manager.addStudent("Aditya", subjects, new int[]{85, 78, 90});
            manager.addStudent("Rahul", subjects, new int[]{60, 55, 70});
            // manager.addStudent("Invalid", subjects, new int[]{110, 50, 40});
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }

        manager.generateReports();
    }
}
