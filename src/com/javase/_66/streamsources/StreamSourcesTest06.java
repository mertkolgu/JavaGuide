package com.javase._66.streamsources;

import java.util.stream.IntStream;

public class StreamSourcesTest06 {

    public static void main(String[] args) {
        IntStream.iterate(10, i -> i + 5).limit(6).forEach(System.out::println);

        // public static IntStream iterate(final int seed, final IntUnaryOperator f)
// 		10
//		15
//		20
//		25
//		30
//		35
    }
}
