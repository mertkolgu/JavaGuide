package com.javase._62.streamintermediate;

import java.util.stream.Stream;

public class IntermediateFilterTest03 {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::print);    // monkey
    }
}