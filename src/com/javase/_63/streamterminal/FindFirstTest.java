package com.javase._63.streamterminal;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class FindFirstTest {

    public static void main(String[] args) {

        // DoubleStream filter(DoublePredicate predicate);
        OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findFirst();

        // DoubleStream filter(DoublePredicate predicate);
        OptionalDouble temperature2 = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findAny();

        System.out.println(temperature);
        System.out.println(temperature2);
    }
}