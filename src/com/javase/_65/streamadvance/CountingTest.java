package com.javase._65.streamadvance;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingTest {

    public static void main(String[] args) {

        Stream<String> ohMy = Stream.of("lions", "tigers", "bears", "cat", "cat", "bird", "horse", "dog");

        Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(map);
    }
}