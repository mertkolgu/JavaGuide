package com.javase._66.optional;

import java.util.Optional;

public class OptionalTest01 {

    public static void main(String[] args) {

        Optional<String> emptyOptional = Optional.empty();

        Optional<String> opt1 = Optional.of("value");
        System.out.println(opt1);
    }
}

// The class java.util.Optional is a holder for value that can be null.