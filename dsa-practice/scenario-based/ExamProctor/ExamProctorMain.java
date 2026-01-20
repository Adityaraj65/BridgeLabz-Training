package ExamProctor;

public class ExamProctorMain {
    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.goBack(); // navigation using stack

        exam.submitExam();
    }
}

