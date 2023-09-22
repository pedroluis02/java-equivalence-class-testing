package com.github.pedroluis02.equivalenceclasstesting.maxvalue;

public class MaxIntegerValueFinder implements MaxNumberValueFinder <Integer>{

    private final Integer minRangeValue;
    private final Integer maxRangeValue;

    public MaxIntegerValueFinder(Integer minRangeValue, Integer maxRangeValue) {
        this.minRangeValue = minRangeValue;
        this.maxRangeValue = maxRangeValue;
    }

    @Override
    public Integer average(Integer min, Integer max) {
        return min + (max - min)/2;
    }

    @Override
    public boolean isSafe(Integer average, Integer min, Integer max) {
        return (average.intValue() == min.intValue()) || (average.intValue() == max.intValue());
    }

    @Override
    public Integer getMinRangeValue() {
        return minRangeValue;
    }

    @Override
    public Integer getMaxRangeValue() {
        return maxRangeValue;
    }
}
