import java.util.Random;
import java.util.Scanner;

public class MathQuiz {

    private int quizScore;

    public MathQuiz() {
        this.quizScore = 0;
    }

    public int getQuizScore() {
        return quizScore;
    }

    public void gameStart(Scanner scanner) {
        Random rand = new Random();

        int correctAnswer;
        int userAttempt;

        for (int i = 0; i < 5; i++) {

            int n1 = rand.nextInt(50);
            int n2 = rand.nextInt(50);
            correctAnswer = n1 + n2;

            System.out.println("What is " + n1 + " + " + n2 + "?: ");
            userAttempt = scanner.nextInt();

            if (userAttempt == correctAnswer) {
                System.out.println("Correct!");
                quizScore++;
            } else {
                System.out.println("Wrong! ... Correct answer is: " + correctAnswer);
            }
        }
        System.out.println("You got " + quizScore + " points!");
        scanner.close();
    }
}
