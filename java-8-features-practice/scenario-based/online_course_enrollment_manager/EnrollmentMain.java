package online_course_enrollment_manager;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class EnrollmentMain {
    public static void main(String[] args) {
        Enrollment enrollment1=new Enrollment("Aditya","java","programming", LocalDate.of(2025, 12, 27),"S101");
        Enrollment enrollment2=new Enrollment("shayam","DBMS","database",LocalDate.of(2022, 1, 1),"S103");
        Enrollment enrollment3=new Enrollment("saket","DBMS","database",LocalDate.of(2025, 10, 27),"S104");
        Enrollment enrollment4=new Enrollment("priya","java","programming",LocalDate.of(2025, 11, 27),"S102");
        EnrollmentUtil eu=new EnrollmentUtil();
        eu.addEnrolment(enrollment1);
        eu.addEnrolment(enrollment2);
        eu.addEnrolment(enrollment3);
        eu.addEnrolment(enrollment4);
//        filtering based on specific course
        String courseToFilter="java";
        List<Enrollment> enrollmentOfJava=eu.filterEnrollmentByCourse(courseToFilter);
        System.out.println("enrollment in java ");
        enrollmentOfJava.forEach(System.out::println);

        System.out.println("----------------------------");
        String courseCategory="Database";
        List<Enrollment> enrollmentInCourse=eu.filterEnrollmentByCourseCategory(courseCategory);
        System.out.println("enrollment in database ");
        enrollmentInCourse.forEach(System.out::println);
        //Group enrollments by course name
        System.out.println("=====grouping enrollment by course name==========");
        Map<String,List<Enrollment>> map=eu.enrollmentList.stream().collect(Collectors.groupingBy(Enrollment::getCourseName));
        for(Map.Entry<String,List<Enrollment>> m:map.entrySet()){
            System.out.println(m);
            System.out.println("------------------------");
        }
        //Count the number of enrollments per category
        Map<String ,Long>courseCountByCategory=eu.enrollmentList.stream().collect(Collectors.groupingBy(Enrollment::getCourseCategory,Collectors.counting()));
        System.out.println(courseCountByCategory);
        //sort and display enrollment by enrollment date
        List<Enrollment> list1 = eu.enrollmentList.stream().sorted(Comparator.comparing(Enrollment::getEnrollmentDate)).collect(Collectors.toList());
        System.out.println("sorted enrolment list");
        System.out.println(list1);
    }
}
