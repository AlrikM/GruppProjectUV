import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                Hello there!
                What would you like to do?
                1. Play 
                2. Check high scores
                0. Quit
                """);

        //För att starta Quizzet: (TO DO: lägg till menyval till huvudmenyn)
        MathQuiz mathQuiz = new MathQuiz();
        mathQuiz.gameStart();
    }
}
