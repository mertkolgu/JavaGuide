package com.javase._62.streamintermediate;

import java.util.stream.IntStream;

public class IntermediateFilterTest02 {

    public static void main(String[] args) {

        IntStream.rangeClosed(0, 10).map(i -> i * i).filter(i -> (i % 2) == 0).forEach(System.out::println);
    }
}