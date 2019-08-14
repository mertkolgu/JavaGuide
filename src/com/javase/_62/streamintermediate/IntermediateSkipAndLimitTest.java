package com.javase._62.streamintermediate;

import java.util.stream.Stream;

public class IntermediateSkipAndLimitTest {

    public static void main(String[] args) {

        Stream<Integer> s = Stream.iterate(10, n -> n + 3);

        // 10
        // 13
        // 16
        // 19
        // 22

        // 25
        // 28
        // 31

        // skip(5) üretilen 5 elemanı atla
        s.skip(5).limit(3).forEach(System.out::println);    // 67
    }
}