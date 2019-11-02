package com.javase._57.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTest03 {

    public static void main(String[] args) {

        // public static LocalDateTime now() {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());
    }
}