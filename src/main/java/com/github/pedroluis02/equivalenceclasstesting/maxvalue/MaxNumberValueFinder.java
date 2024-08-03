package com.github.pedroluis02.equivalenceclasstesting.maxvalue;

import java.util.logging.Level;
import java.util.logging.Logger;

public interface MaxNumberValueFinder<E extends Number> {
    default E calculate(MaxValueOperation<E> operation) {
        final var logger = Logger.getGlobal();

        E currentMin = minRangeValue();
        E currentMax = maxRangeValue();
        E currentAverage = average(currentMin, currentMax);

        boolean isSafe;
        do {
            isSafe = isSafe(currentAverage, currentMin, currentMax);
            try {
                logger.log(Level.INFO, "{0} from [min={1} max={2}]", new Object[]{currentAverage, currentMin,
                        currentMax});
                final var result = operation.method(currentAverage);
                logger.log(Level.INFO, "{0}", result);

                if (!isSafe) {
                    logger.log(Level.INFO, "{0} should be more", currentAverage);
                    currentMin = currentAverage;
                }
            } catch (AssertionError e) {
                if (!isSafe) {
                    logger.log(Level.INFO, "{0} should be less", currentAverage);
                    currentMax = currentAverage;
                }
            } finally {
                currentAverage = average(currentMin, currentMax);
            }
        } while (!isSafe);

        return currentAverage;
    }

    E minRangeValue();

    E maxRangeValue();

    E average(E min, E max);

    boolean isSafe(E average, E min, E max);
}
