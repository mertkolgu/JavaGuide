package com.javase._28.operators;

public class OperatorsTest07 {

    public static void main(String[] args) {

        // 6 -> 0110
        // 8 -> 1000
        // ---------
        //      0000
        System.out.println(6 & 8);

        // 5 -> 0101
        // 9 -> 1001
        // ---------
        //      1101
        System.out.println(5 | 9);

        // aynı ise 0, farklı ise 1
        // 7 -> 0111
        // 5 -> 0101
        // ---------
        //      0010
        System.out.println(7 ^ 5);
    }
}