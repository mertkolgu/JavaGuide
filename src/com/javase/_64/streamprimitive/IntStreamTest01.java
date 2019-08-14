package com.javase._64.streamprimitive;

import java.util.stream.IntStream;

public class IntStreamTest01 {

    public static void main(String[] args) {

        IntStream count = IntStream.iterate(10, n -> n + 3).limit(5);
        count.forEach(System.out::println);

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
    }
}