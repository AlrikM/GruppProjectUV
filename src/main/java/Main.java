import java.util.Scanner;

public class Main {
    /**
     * initiates obj and opens start menu
     * user choses option 1-3
     * 1. initiates math quiz and sets user score and name into highscore before-
     * sent back to menu loop
     * 2. show Highscore top 5 games
     * 3. finishes loop and finishes running program
     */
    public static void main(String[] args) {
        Highscore highscore = new Highscore(); // creates Highscore obj
        Scanner scan = new Scanner(System.in); // create Scanner obj
        User user = new User(); // create User obj
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
                        mathQuiz.gameStart(scan);
                        System.out.println("What's your name?");
                        user.setName(scan.next());
                        user.setScore(mathQuiz.getQuizScore());
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
