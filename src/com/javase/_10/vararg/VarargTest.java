package com.javase._10.vararg;

public class VarargTest {

    public static void main(String[] args) {
        method();
        method(1);
        method(2, 4);
        method(2, 6, 7);

        method2();
        method2("param1");
        method2("param1", "param2");
    }
    // bir method içerisinde vararg en sonda olmalıdır.
    // bir method içerisinde bir tane olmalı.
    // ... değişken isminden önce olmalıdır.
    public static void method(int... numbers) {
        System.out.println(numbers.length);
    }

    public static void method2(String... numbers) {
        System.out.println(numbers.length);
    }
}
