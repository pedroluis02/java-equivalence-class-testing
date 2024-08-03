package com.github.pedroluis02.equivalenceclasstesting;

import com.github.pedroluis02.equivalenceclasstesting.maxvalue.MaxIntegerValueFinder;
import com.github.pedroluis02.equivalenceclasstesting.simple.MathFunctions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.info("Java Equivalence class testing");
        findMaxFactorialValue();
    }

    private static void findMaxFactorialValue() {
        var finder = new MaxIntegerValueFinder(0, 30);
        var result = finder.calculate(MathFunctions::factorial);
        logger.log(Level.INFO, "Last max value is: {0}", result);
    }
}