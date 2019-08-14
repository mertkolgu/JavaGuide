package com.javase._62.streamintermediate;

import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateSortedTest {

    // Stream<T> sorted()
    // Stream<T> sorted(Comparator<? super T> comparator)

    public static void main(String[] args) {

        Stream<String> s = Stream.of("brown-", "bear-", "bee-");
        s.sorted().forEach(System.out::print); // bear-bee-brown-

        System.out.println();
        Stream<String> s2 = Stream.of("brown-", "bear-", "bee-");
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::print); // brown-bee-bear-
    }
}