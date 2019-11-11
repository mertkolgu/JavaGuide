package com.javase._71.optional;

import java.util.Optional;

public class OptionalTest03 {

    public static void main(String[] args) {
        Optional<String> nullable = Optional.ofNullable(null);
        System.out.println(nullable);   // Optional.empty
    }
}
