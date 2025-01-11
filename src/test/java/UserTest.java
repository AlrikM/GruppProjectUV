import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserTest {

    @Test
    void correct() {
        User p1 = new User();
        assertEquals(5, p1.setScore(5));
    }

    @Test
    void getScore(){
        User p1 = new User();
        p1.setScore(2);
        assertEquals(2, p1.getScore());
    }

    @Test
    void setName() {
        User p1 = new User();
        assertEquals("David", p1.setName("David"));
    }

    @Test
    void getName() {
        User p1 = new User();
        p1.setName("Albert");
        assertEquals("Albert",p1.getName());
    }
}