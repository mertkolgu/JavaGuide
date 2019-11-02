package com.javase._64.streamprimitive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumTest {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n));

        Stream<Integer> stream2 = Stream.of(1, 2, 3);

        // IntStream mapToInt(ToIntFunction<? super T> mapper);
        // int applyAsInt(T value);
        IntStream is = stream2.mapToInt(x -> x);

        System.out.println(is.sum());

        // IntStream
        // int sum();

        // LongStream
        // long sum();

        // DoubleStream
        // double sum();
    }
}