package com.javase._25.arrays;

public class ArrayTest01 {

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < 5; i++)
            array[i] = i * 4 + 2;


        for (int i = 0; i < 5; i++)
            System.out.println(array[i]);
    }
}
