package com.javase._68.streamterminal;

import java.util.stream.Stream;

public class CountTest01 {

    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("k1", "k2", "k3");

        // long count();
        long countElement = s1.count();

        System.out.println(countElement);   // 3
        // java.lang.IllegalStateException: stream has already been operated upon or
        // closed
        // s1.count();
    }
}

// bir stream üzerinde sadece bir kez Terminal metodunu çağırabiliriz.
// birden fazla terminal metodunu aynı stream için çağıramayız.
