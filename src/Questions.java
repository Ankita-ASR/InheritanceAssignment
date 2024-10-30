import java.util.ArrayList;
import java.util.List;

public class Questions {
    private String questionText;

    public void addText(String text) {
        questionText += text + " ";
    }
}

class ChoiceQuestion extends Questions {
    public List<String> choices = new ArrayList<>();

    public void addChoice(String choice) {
        choices.add(choice);
    }

    // Use addText instead of storing choices directly
}
