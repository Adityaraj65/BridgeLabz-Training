package online_course_enrollment_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EnrollmentUtil {
    List<Enrollment> enrollmentList=new ArrayList<>();
    public void addEnrolment(Enrollment e){
        for(Enrollment i:enrollmentList){
            if(i.getStudentId().equals(e.getStudentId())){
                System.out.println("student already enrolled");
                return;
            }

        }
        enrollmentList.add(e);
        System.out.println("Enrollment added ");


    }
    public List<Enrollment> filterEnrollmentByCourse(String course){
        List<Enrollment>list=enrollmentList.stream().filter(a->a.getCourseName().equalsIgnoreCase(course)).collect(Collectors.toList());
        return list;
    }
    public List<Enrollment> filterEnrollmentByCourseCategory(String courseCategory){
        List<Enrollment>list=enrollmentList.stream().filter(a->a.getCourseCategory().equalsIgnoreCase(courseCategory)).collect(Collectors.toList());
        return list;
    }
}
