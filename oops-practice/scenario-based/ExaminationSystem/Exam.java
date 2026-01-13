package ExaminationSystem;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    String examName;
    List<Question> questions = new ArrayList<>();
    boolean isActive = true; // exam running or not

    public Exam(String examName) {
        this.examName = examName;
    }

    // Add question to exam
    public void addQuestion(Question q) {
        questions.add(q);
    }

    // End the exam
    public void endExam() {
        isActive = false;
    }
}

