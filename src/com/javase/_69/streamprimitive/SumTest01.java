package com.javase._69.streamprimitive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumTest01 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n));  // 6

        Stream<Integer> stream2 = Stream.of(1, 2, 3);

        // IntStream mapToInt(ToIntFunction<? super T> mapper);
        // int applyAsInt(T value);
        IntStream is = stream2.mapToInt(x -> x);

        System.out.println(is.sum());   // 6
        // IntStream
        // int sum();

        // LongStream
        // long sum();

        // DoubleStream
        // double sum();
    }
}
