package com.javase._62.streamintermediate;

import java.util.stream.Stream;

public class InfiniteTest {

    public static void main(String[] args) {

        // public static<T> Stream<T> generate(Supplier<T> s) {
//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .sorted()
//                .limit(2).forEach(System.out::println);

        // java.lang.OutOfMemoryError: Java heap space

        Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);
    }
}