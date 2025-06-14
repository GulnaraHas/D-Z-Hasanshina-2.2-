import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {
    @Test
    public void testAddition() {
        assertEquals(8, ArithmeticOperations.add(5, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, ArithmeticOperations.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, ArithmeticOperations.multiply(5, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(1.666, ArithmeticOperations.divide(5, 3), 0.001);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            ArithmeticOperations.divide(5, 0);
        });
    }
}