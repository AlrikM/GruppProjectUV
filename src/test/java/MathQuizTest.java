import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class MathQuizTest {

    @Test
    void testGetQuizScore() {
        MathQuiz mathQuiz = new MathQuiz();
        assertEquals(0, mathQuiz.getQuizScore());

    }
}