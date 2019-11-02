package com.javase._63.streamterminal;

import java.util.stream.Stream;

public class ReduceTest02 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w1", "o2", "l3", "f4");
        String word = stream.reduce("X", String::concat);
        System.out.println(word); // wolf

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", (s, c) -> s + c + "--");
        System.out.println(word2);
    }
}