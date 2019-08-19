package com.javase._88.methods;

public class MethodsTest03 {

    public static int ikiCarp(int number) {
        return number * 2;
    }

    public static int ikiTopla(int number) {
        return number + 2;
    }

    public static int dortCarp(int number) {
        return number * 4;
    }

    public static void main(String[] args) {

        System.out.println("Sonuç = " + dortCarp(ikiTopla(ikiCarp(8))));
        // 8 * 2 = 16
        // 8 + 2 = 18
        // 18 * 4 = 72
        // Sonuç = 72
    }
}