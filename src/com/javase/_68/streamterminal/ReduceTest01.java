package com.javase._68.streamterminal;

import java.util.stream.Stream;

public class ReduceTest01 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3, 5, 6);
        Stream<Integer> stream2 = Stream.of(3, 5, 6);

        // T reduce(T identity, BinaryOperator<T> accumulator);
        System.out.println(stream.reduce(10, (a, b) -> a * b)); // 900

        // Optional<T> reduce(BinaryOperator<T> accumulator);
        System.out.println(stream2.reduce((a, b) -> a * b));    // Optional[90]
    }
}
