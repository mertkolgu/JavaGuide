package com.javase._34.string;

public class StringTest01 {

    public static void main(String[] args) {

        // String Pool

        String x = "java";
        String y = "java";
        System.out.println(x == y);
        // Burada bir tane obje oluşur!
        // Compiler ikinci objeyi oluşturmaz!

        String x2 = new String("java"); // her new için yeni bir obje oluşur
        String y2 = new String("java");
        System.out.println(x2 == y2);
        System.out.println(x2.equals(y2));
    }
}