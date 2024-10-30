public class AnyCorrectChoiceQuestion extends Questions {
    private String[] correctChoices;

    public AnyCorrectChoiceQuestion(String questionText, String[] correctChoices) {
        super(questionText);
        this.correctChoices = correctChoices;
    }
    public boolean checkAnswer(String response) {
        for (String choice : correctChoices) {
            if (response.trim().equalsIgnoreCase(choice)) {
                return true;
            }
        }
        return false;
    }
}
