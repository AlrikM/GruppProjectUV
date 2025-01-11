import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Highscore highscore = new Highscore();
        Scanner scan = new Scanner(System.in);
        User user = new User();
            while (true) {
                int quit = 0;
                System.out.println("""
                        Hello there!
                        What would you like to do?
                        1. Play
                        2. Check high scores
                        3. Quit
                        """);
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        MathQuiz mathQuiz = new MathQuiz();
                        int score = mathQuiz.gameStart(scan);
                        System.out.println("What's your name?");
                        user.setName(scan.next());
                        user.setScore(score);
                        highscore.addScore(user.getName(), user.getScore());
                        continue;
                    case 2:
                        highscore.displayTopScores();
                        continue;
                    case 3:
                        quit = 1;
                        break;
                    default:
                        System.out.println("Please use number 1-3!");
                }
                if (quit == 1){
                    break;
                }
            }
    }
}
