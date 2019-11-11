package com.javase._69.streamprimitive;

import java.util.stream.DoubleStream;

public class DoubleStreamTest01 {

    public static void main(String[] args) {
        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);

        DoubleStream random = DoubleStream.generate(Math::random);
        random.limit(3).forEach(System.out::println);
        // 0.7629231252916412
        // 0.7273644853138895
        // 0.7854909940147509

        DoubleStream fractions = DoubleStream.iterate(0.5, d -> d / 2);
        System.out.println();
        fractions.limit(5).forEach(System.out::println);
        // 0.5
        // 0.25
        // 0.125
        // 0.0625
        // 0.03125
    }
}
