package com.javase._25.arrays;

public class ArrayInitialize {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 40};

        int[] compileError;
        // compileError = {30, 40, 50}; // compile error

        int[] validArray;
        validArray = new int[]{30, 40, 50}; // OK

        int[][] scores = {{5, 2, 4, 7}, {9, 2}, {3, 4}};

        int[] compileError2;
        // compileError2 = new int[3]{30, 40, 50};  // size veremeyiz compile error!
    }
}
