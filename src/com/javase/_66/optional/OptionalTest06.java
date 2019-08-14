package com.javase._66.optional;

import java.util.Optional;

public class OptionalTest06 {

    public static void main(String[] args) {

        Optional<String> string = Optional.ofNullable(null);
        System.out.println(string.map(String::length).orElseThrow(IllegalArgumentException::new));

        // public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
    }
}