package com.javase._06.declarevariable;

public class Person {

    private int age;    // instance variable
    // access modifier olarak private, protected, public olabilir!
    // değişken abstract OLAMAZ!

    private static int number;  // static variable

    void method() {

        String name = "user";   // local variable
        // local değişkenler access modifier ALAMAZ!
        // private, protected, public vs. OLAMAZ!

        final String finalName = "admin";
        // finalName = "compile error";     // final değişkenin değeri 1 kere assign edilir.

        // local değişkenler stack'te yaşar.
        // instance değişkenler ise heap'te yaşar.

        String str; // varsayılan değeri null değil, uninitialized'dir.
        int number = 0;
        // local değişkenlere otomatik olarak değer ATANMAZ.
        // "number"ın değeri 0 değildir. uninitialized durumdadır.

        System.out.println(number);
        // System.out.println(str);
    }
}