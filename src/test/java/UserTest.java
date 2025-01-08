import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserTest {

    @Test
    void correct() {
        User p1 = new User();
        assertEquals(1, p1.correct());
    }

    @Test
    void setName() {
        User p1 = new User();
        assertEquals("David", p1.setName("David"));
    }
}