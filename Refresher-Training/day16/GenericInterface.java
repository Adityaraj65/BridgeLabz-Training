package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    int score;

    Student(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return this.score - other.score;
    }

    @Override
    public String toString() {
        return "Student{score=" + score + "}";
    }
}

public class GenericInterface {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(85));
        students.add(new Student(92));
        students.add(new Student(67));
        students.add(new Student(78));

        System.out.println("Before sorting:");
        System.out.println(students);

        Collections.sort(students);

        System.out.println("After sorting:");
        System.out.println(students);
    }
}
