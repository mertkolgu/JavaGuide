package com.javase._66.optional;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalTest10 {

    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = stream.average();
        System.out.println(optional);
    }
}