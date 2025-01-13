import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserTest {

    /**
     * if function puts in 5, expected variable 5 from obj score
     */
    @Test
    void correct() {
        User p1 = new User();
        assertEquals(5, p1.setScore(5));
    }

    /**
     * if trigger function, get preset score from object
     */
    @Test
    void getScore(){
        User p1 = new User();
        p1.setScore(2);
        assertEquals(2, p1.getScore());
    }

    /**
     * if set name, expected setted name
     */
    @Test
    void setName() {
        User p1 = new User();
        assertEquals("David", p1.setName("David"));
    }

    /**
     * if trigger function, expected preset name
     */
    @Test
    void getName() {
        User p1 = new User();
        p1.setName("Albert");
        assertEquals("Albert",p1.getName());
    }
}