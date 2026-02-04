package json_data;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {

    public static void main(String[] args) {

        JSONArray subjects = new JSONArray();
        subjects.put("Maths");
        subjects.put("Physics");
        subjects.put("Computer Science");

        JSONObject student = new JSONObject();
        student.put("name", "Aditya");
        student.put("age", 21);
        student.put("subjects", subjects);

        System.out.println(student);
    }
}

