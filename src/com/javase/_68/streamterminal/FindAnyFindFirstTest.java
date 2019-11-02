package com.javase._63.streamterminal;

import java.util.stream.Stream;

public class FindAnyFindFirstTest {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println); // monkey

        infinite.findAny().ifPresent(System.out::println);  // chimp
    }
}

// Optional<T> findFirst();
// Optional<T> findAny();