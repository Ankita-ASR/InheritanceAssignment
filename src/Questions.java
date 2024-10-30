public class Questions {
    private String questionText;
    private String answer;

    public Questions(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return response.trim().equalsIgnoreCase(answer);
    }
}
