package com.javase._65.streamadvance;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapTest02 {

    public static void main(String[] args) {

        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

        Map<Integer, String> map = ohMy.collect(Collectors.toMap(String::length, k -> k)); // BAD
        // Duplicate key 5 (attempted merging values lions and bears)
    }
}