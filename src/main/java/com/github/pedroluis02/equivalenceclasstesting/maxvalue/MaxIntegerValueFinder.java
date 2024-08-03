package com.github.pedroluis02.equivalenceclasstesting.maxvalue;

public record MaxIntegerValueFinder(Integer minRangeValue, Integer maxRangeValue)
        implements MaxNumberValueFinder<Integer> {
    @Override
    public Integer average(Integer min, Integer max) {
        return min + (max - min) / 2;
    }

    @Override
    public boolean isSafe(Integer average, Integer min, Integer max) {
        return (average.intValue() == min.intValue()) || (average.intValue() == max.intValue());
    }
}
