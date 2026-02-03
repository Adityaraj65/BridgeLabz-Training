package reflection.generatejson;

public class Test {

    public static void main(String[] args) {
        Student student = new Student(101, "Aditya", 22);
        String json = JsonUtil.toJson(student);

        System.out.println(json);
    }
}

