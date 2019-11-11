package com.javase._60.consumer;

import java.util.function.Consumer;

public class ConsumerTest01 {

    public static void main(String[] args) {
        // java.util.function.Consumer
        // void accept(T t)
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
        // Stream
        // void forEach(Consumer<? super T> action);
    }
}
