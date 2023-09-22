package com.github.pedroluis02.equivalenceclasstesting.maxvalue;

@FunctionalInterface
public interface MaxValueOperation <E extends Number> {
    E method(E value);
}
