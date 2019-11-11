package com.javase._36.string;

public class StringTest03 {

    public static void main(String[] args) {
        String name = "admin user";

        // boyutunu gösterir
        int length = name.length();
        System.out.println(length); // 10
        // System.out.println(name.length());

        // dolu ya da boş olup olmadığını gösterir. true ya false döner.
        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);    // false
        // System.out.println(name.isEmpty());

        // istenilen indeksteki karakteri gösterir.
        System.out.println(name.charAt(3)); // i

        // başlangıç değerini kontrol eder. true ya da false döndürür.
        System.out.println(name.startsWith("ad"));  // true

        // bitiş değerini kontrol eder. true ya da false döndürür.
        System.out.println(name.endsWith("er"));    // true

        // [1, 5) arasındaki karaktarleri gösterir
        System.out.println(name.substring(1, 5));   // dmin

        // baştan itibaren tarar. denk geldiği indeksi ekrana basar
        System.out.println(name.indexOf("u"));  // 6

        // sondan itibaren tarar. denk geldiği indeksi ekrana basar
        System.out.println(name.lastIndexOf("e"));  // 8
    }
}
