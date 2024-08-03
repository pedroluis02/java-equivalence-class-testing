package com.github.pedroluis02.equivalenceclasstesting.simple;

public class MathFunctions {

    public static final int MAX_INT_FACTORIAL_VALUE = 16;
    public static final double SQUARE_ROOT_TOLERANCE = 0.00001;

    public static int factorial(int n) {
        assert n >= 0;
        var result = factorialFunc(n);
        if (result <= 0) {
            throw new AssertionError();
        }

        return result;
    }

    public static double squareRoot(double n) {
        return squareRoot(n, SQUARE_ROOT_TOLERANCE);
    }

    public static double squareRoot(double n, double tolerance) {
        assert n >= 0;

        if (n == 0) {
            return 0;
        } else {
            final double guess = (n / 2);
            return squareRootFunc(n, guess, tolerance);
        }
    }

    // fact(n) = n! = 1 * 2 * 3 * ... * n
    // Base case when n=0, return 1
    // Other case n > 0, return n * fact(n)
    private static int factorialFunc(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorialFunc(n - 1);
    }

    private static double squareRootFunc(double n, double guess, double tolerance) {
        double nextGuess = (guess + n / guess) / 2;
        if (Math.abs(guess - nextGuess) <= tolerance)
            return nextGuess;
        else
            return squareRootFunc(n, nextGuess, tolerance);
    }
}
