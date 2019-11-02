package com.javase._36.string;

public class StringTest04 {

    public static void main(String[] args) {
        // String'i Integer'a çevirme
        String a = "1923";
        int b = Integer.parseInt(a);

        System.out.println(b);
        System.out.println(b - 42);

        // Integer'ı String'e çevirme
        int a1 = 1923;
        String b1 = String.valueOf(a1);

        System.out.println(b1);
        System.out.println(b1 + "a");
    }
}
