package com.javase._50.generics;

public class GenericsTest09 {

    public static void main(String[] args) {
        boundedType(100);
        boundedType(100.05);
        boundedType(100L);

        // boundedType("compile error");   // String IS-A Number değildir.
        // T extends Number -> T tipi Number sınıfının subclass'ı olsun diyor!

        System.out.println();
        unboundedType(100);
        unboundedType("key");
    }

    public static <T extends Number> void boundedType(T t) {
        System.out.println(t.getClass());
    }

    public static <T> void unboundedType(T t) {
        System.out.println(t.getClass());
    }
}
