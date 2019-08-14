package com.javase._06.declarevariable;

public class NotesForVariable {

    String str = "text";    // reference type
    char ch = 'a';          // primitive
    Integer i = 100;        // reference type
    int i1 = 100;           // primitive
    byte by = 100;          // primitive
    short sh = 10;          // primitive
    float fl = 1.2f;        // primitive
    double dl = 1.2;        // primitive
    long l = 100;           // primitive
    boolean b = true;       // primitive
    int[] array;            // reference type

    public static void main(String[] args) {

        System.out.println("Byte MAX : " + Byte.MAX_VALUE);
        System.out.println("Byte MIN : " + Byte.MIN_VALUE);

        System.out.println("Short MAX : " + Short.MAX_VALUE);
        System.out.println("Short MIN : " + Short.MAX_VALUE);

        System.out.println("Integer MAX : " + Integer.MAX_VALUE);
        System.out.println("Integer MIN : " + Integer.MIN_VALUE);

        System.out.println("Float MAX : " + Float.MAX_VALUE);
        System.out.println("Float MIN : " + Float.MAX_VALUE);

        System.out.println("Long MAX : " + Long.MAX_VALUE);
        System.out.println("Long MIN : " + Long.MIN_VALUE);

        System.out.println("Double MAX : " + Double.MAX_VALUE);
        System.out.println("Double MIN : " + Double.MIN_VALUE);
    }
}

// değişkenler
// 1 - primitive variable
// 2 - reference type variable

// Java'da 8 tip primitive değişken vardır.

// byte, short, int, long, float, double, char, boolean
// bu 8 tip dışındaki BÜTÜN değişkenler reference type'dır.
// byte -> short -> int -> long
// int -> float -> double
// byte -> 8 bit/1 byte yer kaplar.
// short -> 16 bit/2 byte yer kaplar.
// char -> 16 bit/2 byte yer kaplar.
// int -> 32 bit/4 byte yer kaplar.
// float -> 32 bit/4 byte yer kaplar.
// long -> 64 bit/8 byte yer kaplar.
// double -> 64 bit/8 byte yer kaplar.
// boolean -> true ya da false değeri alır.

// bir başka açıdan;
// 1 - static variable
// 2 - instance variable
// 3 - local variable

// static keyword'dür.
// 1 - static variable
// 2 - static method
// 3 - static initialize block
// 4 - static nested class
// 5 - static import

// final olabilir.
// değişken final ise değeri bir kez assign edilir.

// non-access modifier : final, static, transient, volatile