package com.javase._19.assignment;

public class PrimitiveAssignmentTest {

    public static void main(String[] args) {

        int number = 10;

        // [-128, 127]
        // 8 bit
        // 256 sayı
        // int (2) değerini daraltıyor/casting yapıyor
        // narrow daraltma casting yapılmakta!

        byte b1 = 100;  // 2 -> int literalidir.
        byte b2 = 80;
        byte b3 = (byte) (b1 + b2); // 180
        // otomatik olarak narrow işlemi yapılmaz!

        System.out.println(b3);
    }
}