package com.javase._07.methods;

public class MethodsTest01 {

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void sum(int number1, int number2, int number3) {
        System.out.println("Toplam = " + (number1 + number2 + number3));
    }

    public static void main(String[] args) {
        hello("Mert");
        sum(10, 12, 15);
    }
}
