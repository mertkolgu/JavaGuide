package com.javase._28.operators;

public class OperatorsTest01 {

    public static void main(String[] args) {

        int number = 10;
        number += 20;    // number = number + 20;
        System.out.println(number);

        int x = 3;
        x *= 2 + 5;

        // x = x + 2 * 5 DEĞİL
        // x = x * (2 + 5) mantığında çalışır
        System.out.println(x);
    }
}