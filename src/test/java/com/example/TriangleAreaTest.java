import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaCalculatorTest {
    @Test
    public void testAreaWithPositiveValues() {
        assertEquals(10.0, TriangleAreaCalculator.calculateArea(5, 4), 0.001);
    }

    @Test
    public void testAreaWithZeroBase() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleAreaCalculator.calculateArea(0, 4);
        });
    }

    @Test
    public void testAreaWithNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleAreaCalculator.calculateArea(5, -4);
        });
    }
}