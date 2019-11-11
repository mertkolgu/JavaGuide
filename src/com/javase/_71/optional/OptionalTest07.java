package com.javase._71.optional;

import java.util.Optional;

public class OptionalTest07 {

    public static void main(String[] args) {
        Optional<Double> opt = Optional.empty();

        System.out.println(opt.orElse(Double.NaN)); // NaN
        System.out.println(opt.orElseGet(() -> Math.random())); // 0.7465411990005608
        // public T orElseGet(Supplier<? extends T> supplier) {
        System.out.println(opt.orElseThrow(() -> new IllegalStateException())); // java.lang.IllegalStateException

        // System.out.println(opt.orElseThrow(IllegalArgumentException::new));

        // Supplier
        // T get();
    }
}
