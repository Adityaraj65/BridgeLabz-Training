package generics;

import java.util.ArrayList;
import java.util.List;


//  Base class for all course evaluation types

abstract class CourseType {
    private String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    // Each course type evaluates differently
    public abstract String getEvaluationDetails();
}

//Exam based course
class ExamCourse extends CourseType {
    private int examDuration; // hours

    public ExamCourse(int examDuration) {
        super("Exam Based");
        this.examDuration = examDuration;
    }

    @Override
    public String getEvaluationDetails() {
        return "Evaluation: " + getEvaluationMethod() +
                ", Duration: " + examDuration + " hours";
    }
}


//  Assignment based course

class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(int totalAssignments) {
        super("Assignment Based");
        this.totalAssignments = totalAssignments;
    }

    @Override
    public String getEvaluationDetails() {
        return "Evaluation: " + getEvaluationMethod() +
                ", Assignments: " + totalAssignments;
    }
}

//Research based course
class ResearchCourse extends CourseType {
    private String researchField;

    public ResearchCourse(String researchField) {
        super("Research Based");
        this.researchField = researchField;
    }

    @Override
    public String getEvaluationDetails() {
        return "Evaluation: " + getEvaluationMethod() +
                ", Field: " + researchField;
    }
}

/*
 * Generic Course class
 * Restricts type to CourseType
 */
class Course<T extends CourseType> {

    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getCourseDetails() {
        return "Course: " + courseName +
                " | " + courseType.getEvaluationDetails();
    }
}

/*
 * Utility class for course operations
 */
class CourseUtils {

    // Works for any course type
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getEvaluationDetails());
        }
    }
}

/*
 * Main class
 */
public class UniversityCourseApp {

    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse(3));

        Course<AssignmentCourse> softwareEngineering =
                new Course<>("Software Engineering", new AssignmentCourse(5));

        Course<ResearchCourse> aiResearch =
                new Course<>("AI Research", new ResearchCourse("Machine Learning"));

        System.out.println("=== Course Details ===");
        System.out.println(math.getCourseDetails());
        System.out.println(softwareEngineering.getCourseDetails());
        System.out.println(aiResearch.getCourseDetails());

        // Mixed list of course types
        List<CourseType> allCourseTypes = new ArrayList<>();
        allCourseTypes.add(math.getCourseType());
        allCourseTypes.add(softwareEngineering.getCourseType());
        allCourseTypes.add(aiResearch.getCourseType());

        System.out.println("\n=== Evaluation Methods ===");
        CourseUtils.displayCourses(allCourseTypes);
    }
}

