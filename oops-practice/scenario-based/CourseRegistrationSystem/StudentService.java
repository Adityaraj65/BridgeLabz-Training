package CourseRegistrationSystem;
import java.util.ArrayList;
public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // add student
    public void addStudent(Student student) {
        if (student == null) {
            System.out.println("Cannot add null student");
            return;
        }
        students.add(student);
    }

    // remove student by id
    public void removeStudent(int studentId) {
        if (students.size() == 0) {
            System.out.println("No students available");
            return;
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                System.out.println("Student removed successfully");
                return;
            }
        }

        System.out.println("Student not found");
    }

    // display all students
    public void displayAllStudents() {
        if (students.size() == 0) {
            System.out.println("No students to display");
            return;
        }

        for (Student s : students) {
            s.displayStudentDetails();
            System.out.println("---------------------");
        }
    }

    // get student by id (will be useful later)
    public Student getStudentById(int studentId) {
        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                return s;
            }
        }
        return null;
    }
}

