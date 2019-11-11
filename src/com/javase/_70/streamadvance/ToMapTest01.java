package com.javase._70.streamadvance;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapTest01 {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

        // Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
        Map<String, Integer> map = ohMy.collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);    // {lions=5, bears=5, tigers=6}
    }
}
