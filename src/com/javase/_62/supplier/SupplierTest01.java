package com.javase._62.supplier;

import java.util.function.Supplier;

public class SupplierTest01 {

    // Supplier<T> # T get();
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "dummy test!";
        Supplier<Integer> supplier1 = () -> 100;

        System.out.println(supplier.get()); // dummy test!
        System.out.println(supplier1.get());    // 100
    }
}
