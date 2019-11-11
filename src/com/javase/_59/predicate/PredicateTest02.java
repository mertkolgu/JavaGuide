package com.javase._59.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest02 {

    public static void main(String[] args) {
        List<String> myList = List.of("java", "hello", "world", "hi", "test");
        Stream<String> myStream = myList.stream();

        Predicate<String> predicate1 = element -> element.length() == 4;
        myStream.filter(predicate1).forEach(System.out::println);   // java test

        Stream<String> myStream2 = myList.stream();

        List<String> filteredList = myStream2.filter(predicate1).collect(Collectors.toList());

        System.out.println(myList); // [java, hello, world, hi, test]
        System.out.println(filteredList);   // [java, test]
    }
}
