package com.javase._64.streamprimitive;

import java.util.stream.DoubleStream;

public class DoubleStreamTest {

    public static void main(String[] args) {

        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);

        DoubleStream random = DoubleStream.generate(Math::random);
        random.limit(3).forEach(System.out::println);

        DoubleStream fractions = DoubleStream.iterate(0.5, d -> d / 2);
        System.out.println();
        fractions.limit(5).forEach(System.out::println);
    }
}