package collectors.student_result_grouping;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students= Arrays.asList(
                new Student("Rohit", "A"),
                new Student("Anjali", "A"),
                new Student("Aman", "B"),
                new Student("Neha", "C")
        );
        Map<String,List<String>> result=students.stream().collect(Collectors.groupingBy(Student::getGrade,
                Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(result);
    }
}
