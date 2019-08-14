package com.javase._26.moreoverloaded;

public class MoreOverloadedTest01 {

    public static void main(String[] args) {

        // 100 -> primitive int tipinde literal
        overloaded(100);
        // long çalışır, obje tipi (Integer) yerine primitive tercih eder.
    }

    // int -> long widening
    public static void overloaded(Long Lo) {
        System.out.println("long");
    }

    // int -> Integer boxing
    public static void overloaded(Integer Lo) {
        System.out.println("Integer");
    }
}