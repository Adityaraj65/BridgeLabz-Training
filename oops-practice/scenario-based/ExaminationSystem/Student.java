package ExaminationSystem;

import java.util.HashMap;
import java.util.Map;

public class Student {
    int studentId;
    String name;

    // Stores answers -> questionId, answer
    Map<Integer, String> answers = new HashMap<>();

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Student submits answer
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
    }
}

