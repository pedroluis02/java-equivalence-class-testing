package com.github.pedroluis02.equivalenceclasstesting.maxvalue;

public interface MaxNumberValueFinder<E extends Number> {
    default E calculate(MaxValueOperation<E> operation) {
        E currentMin = getMinRangeValue();
        E currentMax = getMaxRangeValue();
        E currentAverage = average(currentMin, currentMax);

        boolean isSafe;
        do {
            isSafe = isSafe(currentAverage, currentMin, currentMax);
            try {
                System.out.printf("%s from [min=%s max=%s}\n", currentAverage, currentMin, currentMax);
                System.out.println(operation.method(currentAverage));
                operation.method(currentAverage);
                if (!isSafe) {
                    System.out.printf("%s should be more\n", currentAverage);
                    currentMin = currentAverage;
                }
            } catch (AssertionError e){
                if (!isSafe) {
                    System.out.printf("%s should be less\n", currentAverage);
                    currentMax = currentAverage;
                }
            } finally {
                currentAverage = average(currentMin, currentMax);
            }
        } while (!isSafe);

        return currentAverage;
    }

    E getMinRangeValue();

    E getMaxRangeValue();

    E average(E min, E max);

    boolean isSafe(E average, E min, E max);
}
