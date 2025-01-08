import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    int correctAnswer;
    int userAttempt;
    int quizScore = 0;


    for (int i = 1; i < 5; i++ ){

        int n1 = rand.nextInt(50);
        int n2 = rand.nextInt(50);
        correctAnswer = n1 + n2;

        System.out.println("What is " + n1 + " + " + n2 + "?: ");
        userAttempt = scanner.nextInt();

        if (userAttempt == correctAnswer) {
            System.out.println("Correct!");
            quizScore = quizScore + 1;
        }
        else {
            System.out.println("Wrong!");
        }
    }
}
