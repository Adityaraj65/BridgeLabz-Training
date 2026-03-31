package CourseRegistrationSystem;
import java.util.ArrayList;

public class CourseService {

    private ArrayList<Course> courses = new ArrayList<>();

    // add course
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Cannot add null course");
            return;
        }
        courses.add(course);
    }

    // remove course by id
    public void removeCourse(int courseId) {
        if (courses.size() == 0) {
            System.out.println("No courses available");
            return;
        }

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == courseId) {
                courses.remove(i);
                System.out.println("Course removed successfully");
                return;
            }
        }

        System.out.println("Course not found");
    }

    // display all courses
    public void displayAllCourses() {
        if (courses.size() == 0) {
            System.out.println("No courses to display");
            return;
        }

        for (Course c : courses) {
            c.displayCourseDetails();
            System.out.println("---------------------");
        }
    }

    // get course by id (needed later)
    public Course getCourseById(int courseId) {
        for (Course c : courses) {
            if (c.getCourseId() == courseId) {
                return c;
            }
        }
        return null;
    }

    // get course by name (needed later)
    public Course getCourseByName(String courseName) {
        for (Course c : courses) {
            if (c.getCourseName().equalsIgnoreCase(courseName)) {
                return c;
            }
        }
        return null;
    }
}

