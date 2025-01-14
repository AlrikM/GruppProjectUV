import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class MathQuizTest {

    @Test
    void testGetQuizScore() {
        MathQuiz mathQuiz = new MathQuiz();
        assertEquals(0, mathQuiz.getQuizScore());

    }

    @Test
    void testGameStart() {
        MathQuiz mathQuiz = new MathQuiz();
        assertNotEquals(-1, mathQuiz.getQuizScore());

        int minValue = 0;
        int maxValue = 100;

        assertTrue(mathQuiz.getQuizScore() >= minValue);
        assertTrue(mathQuiz.getQuizScore() <= maxValue);

        assertFalse(mathQuiz.getQuizScore() < minValue);
        assertFalse(mathQuiz.getQuizScore() > maxValue);
    }
}

