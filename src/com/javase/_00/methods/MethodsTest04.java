package com.javase._00.methods;

public class MethodsTest04 {

    public static void sum(int a, int b, int c) {
        // int deneme = 10;
        System.out.println("Toplam = " + (a + b + c));
    }

    public static void main(String[] args) {
        // System.out.println(deneme);
        sum(10, 20, 30);
    }
}

// local değişkenler metod çalıştığı sürece vardır.
// method çalışmayı durdurunca kaybolur.