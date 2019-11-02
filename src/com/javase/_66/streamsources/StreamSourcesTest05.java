package com.javase._61.streamsources;

import java.util.stream.IntStream;

public class StreamSourcesTest05 {

    public static void main(String[] args) {

        IntStream.range(1, 10).forEach(System.out::println);

        System.out.println();
        IntStream.rangeClosed(1, 5).map(e -> e * 2).forEach(System.out::println);
    }
}