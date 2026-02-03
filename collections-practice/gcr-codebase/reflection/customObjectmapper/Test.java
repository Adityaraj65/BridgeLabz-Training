package reflection.customObjectmapper;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        // Create map with field names as keys
        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Aditya");
        data.put("age", 22);

        // Convert Map to Student object
        Student student = ObjectMapperUtil.toObject(Student.class, data);
        // Print result
        System.out.println(student);
    }
}
