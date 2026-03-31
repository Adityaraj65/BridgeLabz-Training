package ExaminationSystem;

public class Question {
    int id;
    String questionText;
    String correctAnswer;
    int marks;

    // Constructor to create a question
    public Question(int id, String questionText, String correctAnswer, int marks) {
        this.id = id;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.marks = marks;
    }
}

