package com.github.pedroluis02.equivalenceclasstesting.simple;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.CoreMatchers.is;

public class SquareRootTest {
    // n < 0
    @Test
    public void testEquivalenceClassZero() {
        assertThrows(AssertionError.class, () -> MathFunctions.squareRoot(-5));
    }

    // n = 0
    @Test
    public void testEquivalenceClassOne() {
        //assertEquals(0, MathFunctions.squareRoot(0));
        assertThat(MathFunctions.squareRoot(0), is(0.0));
    }

    // n > 0
    @Test
    public void testEquivalenceClassTwo() {
        assertThat(MathFunctions.squareRoot(20), is(closeTo(4.47213595499958, MathFunctions.SQUARE_ROOT_TOLERANCE)));
        assertThat(MathFunctions.squareRoot(200.05), is(closeTo(14.14390328021229, MathFunctions.SQUARE_ROOT_TOLERANCE)));
    }
}
