package com.javase._20.literals;

public class LiteralsTest {

    public static void main(String[] args) {
        int number1 = 011;  // 0 ile başlıyor octal
        System.out.println(number1);    // 9

        // int number2 = 08;    // 8 compile error

        int number3 = 0xAB;
        System.out.println(number3);    // 171

        int number4 = 0b111;
        System.out.println(number4);    // 7

        float f1 = 100;
        // float f2 = 100.0;
        // 100.0 literali double tipindedir.
        // double tipindeki bir değişkeni/değeri floata assign ettiğimizde burada veri kaybı riski vardır.
        // bu risk olduğu için Java burada derleme hatası verir.

        float f2 = (float) 100.0;
        float f3 = 100.5f;
        float f4 = 100.5F;
        // 100.5 -> double literali
        // 100.5F/f -> float literali
        // 100 -> integer/int literali
    }
}
