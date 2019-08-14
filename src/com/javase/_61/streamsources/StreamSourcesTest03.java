package com.javase._61.streamsources;

import java.util.stream.Stream;

public class StreamSourcesTest03 {

    public static void main(String[] args) {

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
    }
}