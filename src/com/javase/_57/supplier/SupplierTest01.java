package com.javase._57.supplier;

import java.util.function.Supplier;

public class SupplierTest01 {

    // Supplier<T> # T get();

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "dummy test!";
        Supplier<Integer> supplier1 = () -> 100;

        System.out.println(supplier.get());
        System.out.println(supplier1.get());
    }
}