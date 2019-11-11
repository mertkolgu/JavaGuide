package com.javase._68.streamterminal;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectTest02 {

    public static void main(String[] args) {
        String[] roseQuote = "a rose is a rose is a rose".split(" ");
        Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toSet());
        // words.forEach(System.out::println);
        System.out.println(words);  // [a, rose, is]
    }
}
