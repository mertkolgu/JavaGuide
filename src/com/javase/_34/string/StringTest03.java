package com.javase._34.string;

public class StringTest03 {

    public static void main(String[] args) {

        String name = "admin user";

        // boyutunu gösterir
        int length = name.length();
        System.out.println(length);
        // System.out.println(name.length());

        // dolu ya da boş olup olmadığını gösterir. true ya false döner.
        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);
        // System.out.println(name.isEmpty());

        // istenilen indeksteki karakteri gösterir.
        System.out.println(name.charAt(3));

        // başlangıç değerini kontrol eder. true ya da false döndürür.
        System.out.println(name.startsWith("ad"));

        // bitiş değerini kontrol eder. true ya da false döndürür.
        System.out.println(name.endsWith("er"));

        // [1, 5) arasındaki karaktarleri gösterir
        System.out.println(name.substring(1, 5));

        // baştan itibaren tarar. denk geldiği indeksi ekrana basar
        System.out.println(name.indexOf("u"));

        // sondan itibaren tarar. denk geldiği indeksi ekrana basar
        System.out.println(name.lastIndexOf("e"));
    }
}