package com.github.pedroluis02.equivalenceclasstesting.simple;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    // n < 0
    @Test
    public void testEquivalenceClassZero() {
        assertThrows(AssertionError.class, () -> MathFunctions.factorial(-5));
    }

    // n = 0
    @Test
    public void testEquivalenceClassOne() {
        assertEquals(1, MathFunctions.factorial(0));
    }

    // n > 0
    @Test
    public void testEquivalenceClassTwo() {
        assertEquals(120, MathFunctions.factorial(5));
        assertEquals(3628800, MathFunctions.factorial(10));
    }

    // n is max value
    @Test
    public void testEquivalenceClassThree() {
        assertEquals(2004189184, MathFunctions.factorial(MathFunctions.MAX_INT_FACTORIAL_VALUE));
    }
}
