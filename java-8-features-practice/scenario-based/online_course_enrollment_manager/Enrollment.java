package online_course_enrollment_manager;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Enrollment {
    String studentName;
    String studentId;
    String courseName;
    String courseCategory;
    LocalDate enrollmentDate;
    public Enrollment(String studentName, String courseName, String courseCategory, LocalDate enrollmentDate,String studentId){
        this.studentName=studentName;
        this.courseName=courseName;
        this.courseCategory=courseCategory;
        this.enrollmentDate=enrollmentDate;
        this.studentId=studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseCategory(){
        return courseCategory;
    }
    public LocalDate getEnrollmentDate(){
        return enrollmentDate;
    }
    public String getStudentId(){
        return studentId;
    }
    public String toString(){
        return "Student name"+studentName+"\nstudent ID -> "+studentId+"\ncourse Name -> "+courseName+
                "\ncourse Category -> "+courseCategory+"\nEnrollment date -> "+enrollmentDate;
    }


}
