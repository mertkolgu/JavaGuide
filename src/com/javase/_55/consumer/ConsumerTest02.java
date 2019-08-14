package com.javase._55.consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest02 {

    public static void main(String[] args) {

        Consumer<Integer> c1 = (Integer x) -> System.out.println(x * 2);

        Stream.of(10, 20, 30, 40, 50).forEach(c1);

        System.out.println();
        Stream.of(10, 20, 30, 40, 50).forEach(x -> System.out.println(x));

        System.out.println();
        Stream.of(10, 20, 30, 40, 50).forEach(System.out::println);
    }
}