//Dennis
import java.util.random;
import java.util.scanner;

public class Math {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    int correctAnswer;
    int userAttempt;

    while (true){

        int n1 = rand.nextInt(50);
        int n2 = rand.nextInt(50);
        correctAnswer = n1 + n2;

        System.out.println("What is " n1 + n2 + "?: ");
        userAttempt = scanner.nextLine();

        if (userAttempt == correctAnswer) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wrong!");
        }
    }
}
