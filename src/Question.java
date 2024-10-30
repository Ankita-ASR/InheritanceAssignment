public class Question {
    private String questionText;
    private double correctAnswer;

    public Question(String questionText, double correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public Question(String questionText) {
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean checkAnswer(double response) {
        return response == correctAnswer;
    }
}
