package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void testAdd() {
        assertEquals(5, MathUtils.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(-1, MathUtils.subtract(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, MathUtils.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(0.666, MathUtils.divide(2, 3), 0.001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            MathUtils.divide(5, 0);
        });
    }
}