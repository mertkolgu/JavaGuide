package com.javase._25.wrapper;

public class WrapperTest02 {

    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");

        // int -> Integer
        // String -> Integer valueOf metodu ile yapılabilir.
        // static factory method

        Float f1 = Float.valueOf("100.5");
        // float -> Float
        // String -> Float
    }
}