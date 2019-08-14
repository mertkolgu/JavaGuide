package com.javase._34.string;

public class StringTest03 {

    public static void main(String[] args) {

        String name = "admin user";
        int length = name.length();

        boolean isEmpty = name.isEmpty();

        System.out.println(name.charAt(3));

        System.out.println(name.startsWith("ad"));
        System.out.println(name.substring(1, 5));   // [1, 5)
    }
}