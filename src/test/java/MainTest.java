import org.example.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testAdd() {
    int result = Main.add(5, 3);
    assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        int result = Main.subtract(10, 3);
        assertEquals(7, result);
    }

    @Test
    void testMultiply() {
        int result = Main.multiply(4, 6);
        assertEquals(24, result);
    }

    @Test
    void testDivide() {
        double result = Main.divide(10, 2);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> { Main.divide(5, 0);
        });
    }
}
