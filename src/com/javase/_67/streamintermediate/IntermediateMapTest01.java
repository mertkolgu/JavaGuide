package com.javase._67.streamintermediate;

import java.util.stream.Stream;

public class IntermediateMapTest01 {

    public static void main(String[] args) {
        // Stream interfacesinde yer alan map metodu;
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);

        // IntStream interfacesinde yer alan map metodu;
        // IntStream map(IntUnaryOperator mapper);
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length).forEach(System.out::print);   // 676
    }
}
