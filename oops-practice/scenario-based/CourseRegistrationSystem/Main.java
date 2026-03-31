package CourseRegistrationSystem;

public class Main {

    public static void main(String[] args) {

        try {
            // --------- SERVICES ----------
            StudentService studentService = new StudentService();
            CourseService courseService = new CourseService();

            // --------- STUDENTS ----------
            Student s1 = new Student(1, "Aditya", 21);
            Student s2 = new Student(2, "Rahul", 22);

            studentService.addStudent(s1);
            studentService.addStudent(s2);

            System.out.println("---- STUDENT LIST ----");
            studentService.displayAllStudents();

            // --------- COURSES ----------
            Course c1 = new Course(101, "Java");
            Course c2 = new Course(102, "DBMS");
            Course c3 = new Course(103, "OS");

            courseService.addCourse(c1);
            courseService.addCourse(c2);
            courseService.addCourse(c3);

            System.out.println("---- COURSE LIST ----");
            courseService.displayAllCourses();

            // --------- REGISTRATION ----------
            RegistrationService registrationService =
                    new StudentRegistrationService(studentService, courseService, 2);

            System.out.println("---- COURSE ENROLLMENT ----");
            registrationService.enrollCourseById(1, 101);      // Java
            registrationService.enrollCourseByName(1, "DBMS"); // DBMS

            // --------- ASSIGN GRADES ----------
            System.out.println("---- ASSIGNING GRADES ----");
            registrationService.assignGrade(1, 101, 85);
            registrationService.assignGrade(1, 102, 90);

            // --------- VIEW GRADES ----------
            System.out.println("---- VIEW GRADES ----");
            registrationService.viewGrades(1);

            // --------- COURSE LIMIT CHECK ----------
            System.out.println("---- COURSE LIMIT TEST ----");
            registrationService.enrollCourseById(1, 103); // OS (should fail)

        } catch (CourseLimitException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
