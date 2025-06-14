pimport org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTest {
    @Test
    public void testEqualNumbers() {
        assertEquals("Numbers are equal", NumberComparator.compare(5, 5));
    }

    @Test
    public void testFirstGreater() {
        assertEquals("First number is greater", NumberComparator.compare(6, 5));
    }

    @Test
    public void testSecondGreater() {
        assertEquals("Second number is greater", NumberComparator.compare(5, 6));
    }
}