package com.javase._67.streamintermediate;

import java.util.stream.Stream;

public class IntermediateDistinctTest01 {

    // The distinct() method returns a stream with duplicate values remove
    public static void main(String[] args) {
        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");

        s.distinct().forEach(System.out::print);    // duckgoose

        // Stream metodu;
        // Stream<T> distinct()

        // IntStream metodu;
        // IntStream distinct();
    }
}
