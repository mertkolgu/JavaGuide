package com.javase._59.predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateTest04 {

    public static void main(String[] args) {
        List<String> greeting = new ArrayList<>();
        greeting.add("hello");
        greeting.add("world");
        greeting.add("hi");
        greeting.add("hebele");
        greeting.add("hübele");

        // default boolean removeIf(Predicate<? super E> filter) {
        greeting.removeIf(str -> str.startsWith("h"));
        greeting.forEach(System.out::println);  // world
    }
}
