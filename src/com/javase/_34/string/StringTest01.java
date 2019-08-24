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

        // String OBJELERİNİ equals ile karşılaştır.
        System.out.println(x2 == y2);
        System.out.println(x2.equals(y2));

        // stringi ekrana bastırma
        for (int i = 0; i < x.length(); i++)
            System.out.println(x.charAt(i));
    }
}