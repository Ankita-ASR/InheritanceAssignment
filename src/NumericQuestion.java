public class NumericQuestion extends Question {
    private double correctAnswer;

    public NumericQuestion(String questionText, double correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(String response) {
        try {
            double userAnswer = Double.parseDouble(response);
            return Math.abs(userAnswer - correctAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            // Handle the case where the response cannot be parsed as a double
            return false;
        }
    }
}
