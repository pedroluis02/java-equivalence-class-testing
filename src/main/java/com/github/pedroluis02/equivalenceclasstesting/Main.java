package com.github.pedroluis02.equivalenceclasstesting;

import com.github.pedroluis02.equivalenceclasstesting.maxvalue.MaxIntegerValueFinder;
import com.github.pedroluis02.equivalenceclasstesting.simple.MathFunctions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Equivalence class testing");
        findMaxFactorialValue();
    }

    private static void findMaxFactorialValue() {
        var finder = new MaxIntegerValueFinder(0, 30);
        var result = finder.calculate(MathFunctions::factorial);
        System.out.println("Last max value is: " + result);
    }
}