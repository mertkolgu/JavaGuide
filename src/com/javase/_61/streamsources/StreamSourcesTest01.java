package com.javase._61.streamsources;

import java.util.stream.Stream;

public class StreamSourcesTest01 {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.empty();
        Stream<Integer> stream2 = Stream.of(1);
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 6, 7);
    }
}