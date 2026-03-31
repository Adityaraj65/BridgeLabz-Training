package CourseRegistrationSystem;
public interface RegistrationService {

    // enroll student in a course using course ID
    void enrollCourseById(int studentId, int courseId) throws CourseLimitException;

    // enroll student in a course using course name
    void enrollCourseByName(int studentId, String courseName) throws CourseLimitException;

    // drop a course
    void dropCourse(int studentId, int courseId);

    // assign grade to a student for a course
    void assignGrade(int studentId, int courseId, int grade);

    // view grades of a student
    void viewGrades(int studentId);
}

