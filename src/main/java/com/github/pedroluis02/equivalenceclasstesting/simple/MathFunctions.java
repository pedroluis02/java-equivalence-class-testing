package com.github.pedroluis02.equivalenceclasstesting.simple;

public class MathFunctions {

    private static int factorial(int n) {
        assert n >= 0;
        return factorialFunc(n);
    }

    //fact(n) = n! = 1 * 2 * 3 * ... * n
    // Base case when n=0, return 1
    // Other case n > 0, return n * fact(n)
    private static int factorialFunc(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialFunc(n - 1);
        }
    }
}
