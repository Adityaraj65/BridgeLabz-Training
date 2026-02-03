package reflection.customObjectmapper;

public class Student {

    private int id;
    private String name;
    private int age;
    public Student() {
        // no-arg constructor required for reflection
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

