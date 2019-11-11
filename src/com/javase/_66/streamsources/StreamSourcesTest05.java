package com.javase._66.streamsources;

import java.util.stream.IntStream;

public class StreamSourcesTest05 {

    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(System.out::println);

        System.out.println();   // 1 2 3 4 5 6 7 8 9
        IntStream.rangeClosed(1, 5).map(e -> e * 2).forEach(System.out::println);   // 2 4 6 8 10
    }
}
