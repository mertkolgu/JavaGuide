package com.javase._66.optional;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {

        Optional<String> nullStr = Optional.of(null);   // java.lang.NullPointerException
        System.out.println(nullStr);
    }
}