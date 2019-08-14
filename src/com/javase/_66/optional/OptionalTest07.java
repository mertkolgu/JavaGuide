package com.javase._66.optional;

import java.util.Optional;

public class OptionalTest07 {

    public static void main(String[] args) {

        Optional<Double> opt = Optional.empty();

        System.out.println(opt.orElse(Double.NaN)); //
        System.out.println(opt.orElseGet(() -> Math.random())); // public T orElseGet(Supplier<? extends T> supplier) {
        System.out.println(opt.orElseThrow(() -> new IllegalStateException()));

        // System.out.println(opt.orElseThrow(IllegalArgumentException::new));

        // Supplier
        // T get();
    }
}