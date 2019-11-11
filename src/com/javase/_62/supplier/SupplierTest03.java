package com.javase._62.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTest03 {

    public static void main(String[] args) {
        // public static LocalDateTime now() {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());  // 2019-11-10T14:02:25.654468500
    }
}
