
public class Question {
	  String questionText;
	    String[] options;
	    int correctOption; // 1-based index

	    public Question(String questionText, String[] options, int correctOption) {
	        this.questionText = questionText;
	        this.options = options;
	        this.correctOption = correctOption;
}
	    public boolean isCorrect(int userAnswer) {
	        return userAnswer == correctOption;
	    }

	    public void display() {
	        System.out.println(questionText);
	        for (int i = 0; i < options.length; i++) {
	            System.out.println((i + 1) + ". " + options[i]);
	        }
	    }
	}
