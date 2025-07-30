import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Array of questions
        Question[] questions = {
            new Question("What is the capital of India?", 
                         new String[]{"Delhi", "Mumbai", "Kolkata", "Chennai"}, 1),
            new Question("Which language is used for Android app development?", 
                         new String[]{"Python", "Java", "Swift", "Kotlin"}, 4),
            new Question("Who is the founder of Microsoft?", 
                         new String[]{"Steve Jobs", "Bill Gates", "Elon Musk", "Mark Zuckerberg"}, 2)
        };

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            questions[i].display();
            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        // Final score
        System.out.println("\nQuiz Over! Your Score: " + score + "/" + questions.length);

        scanner.close();
    }
}

