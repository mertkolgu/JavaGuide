package com.javase._66.optional;

import java.util.Optional;

public class OptionalTest04 {

    public static void main(String[] args) {

        Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim).ifPresent(System.out::println);

        // You can also consider Optional as a stream that can have zero elements or one
        // element. So you can apply methods such as map(), filter(), and flatMap()
        // operations on this stream!

        // public void ifPresent(Consumer<? super T> action) {

        //  Consumer<T>
        //  void accept(T t);
    }
}