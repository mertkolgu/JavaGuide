package com.javase._70.streamadvance;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingTest01 {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears", "cat", "cat", "bird", "horse", "dog");

        Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(map);    // {3=3, 4=1, 5=3, 6=1}
    }
}
