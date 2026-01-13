package CourseRegistrationSystem;
import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private int age;

    public Student(int studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + age);
    }

    private ArrayList<Course> enrolledCourses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}

