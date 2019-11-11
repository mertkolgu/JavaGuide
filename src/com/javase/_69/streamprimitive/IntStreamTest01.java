package com.javase._69.streamprimitive;

import java.util.stream.IntStream;

public class IntStreamTest01 {

    public static void main(String[] args) {
        IntStream count = IntStream.iterate(10, n -> n + 3).limit(5);
        count.forEach(System.out::println);
        // 10
        // 13
        // 16
        // 19
        // 22

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
        // 1
        // 2
        // 3
        // 4
        // 5
    }
}
