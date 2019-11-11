package com.javase._71.optional;

import java.util.Optional;

public class OptionalTest01 {

    // The class java.util.Optional is a holder for value that can be null.
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();

        Optional<String> opt1 = Optional.of("value");
        System.out.println(opt1);   // Optional[value]
    }
}
