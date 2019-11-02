package com.javase._07.methods;

public class MethodsTest02 {

    public static int sum(int number1, int number2, int number3) {
        return (number1 + number2 + number3);
    }

    public static void main(String[] args) {
        System.out.println("Toplam = " + sum(10, 12, 15));
    }
}
