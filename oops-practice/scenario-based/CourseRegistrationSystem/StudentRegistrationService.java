package CourseRegistrationSystem;

public class StudentRegistrationService implements RegistrationService {

    private StudentService studentService;
    private CourseService courseService;
    private int maxCourses;

    public StudentRegistrationService(StudentService studentService,
                                      CourseService courseService,
                                      int maxCourses) {
        this.studentService = studentService;
        this.courseService = courseService;
        this.maxCourses = maxCourses;
    }

    @Override
    public void enrollCourseById(int studentId, int courseId)
            throws CourseLimitException {

        Student student = studentService.getStudentById(studentId);
        Course course = courseService.getCourseById(courseId);

        if (student == null || course == null) {
            System.out.println("Student or Course not found");
            return;
        }

        if (student.getEnrolledCourses().size() >= maxCourses) {
            throw new CourseLimitException("Course limit exceeded");
        }

        student.getEnrolledCourses().add(course);
        student.getGrades().add(-1); // grade not assigned yet

        System.out.println("Course enrolled successfully");
    }

    @Override
    public void enrollCourseByName(int studentId, String courseName)
            throws CourseLimitException {

        Course course = courseService.getCourseByName(courseName);

        if (course == null) {
            System.out.println("Course not found");
            return;
        }

        enrollCourseById(studentId, course.getCourseId());
    }

    @Override
    public void dropCourse(int studentId, int courseId) {

        Student student = studentService.getStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        for (int i = 0; i < student.getEnrolledCourses().size(); i++) {
            if (student.getEnrolledCourses().get(i).getCourseId() == courseId) {
                student.getEnrolledCourses().remove(i);
                student.getGrades().remove(i);
                System.out.println("Course dropped successfully");
                return;
            }
        }

        System.out.println("Student not enrolled in this course");
    }

    @Override
    public void assignGrade(int studentId, int courseId, int grade) {

        Student student = studentService.getStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        for (int i = 0; i < student.getEnrolledCourses().size(); i++) {
            if (student.getEnrolledCourses().get(i).getCourseId() == courseId) {
                student.getGrades().set(i, grade);
                System.out.println("Grade assigned");
                return;
            }
        }

        System.out.println("Course not found for student");
    }

    @Override
    public void viewGrades(int studentId) {

        Student student = studentService.getStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        for (int i = 0; i < student.getEnrolledCourses().size(); i++) {
            Course c = student.getEnrolledCourses().get(i);
            int grade = student.getGrades().get(i);

            System.out.println(
                    c.getCourseName() + " : " +
                            (grade == -1 ? "Not Assigned" : grade)
            );
        }
    }
}
