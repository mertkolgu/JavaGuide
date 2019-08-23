package com.javase._23.arrays;

public class ArrayMultiDimension {

    public static void main(String[] args) {

        int[][] myArray = new int[3][];
        // 2-D array tanımladık.
        // elemanları -> int[]
        // elemanları int[] olduğu için -> null atanır!

        int[] oneDimension = new int[3];
        // elemanları -> int tipindedir.
        // elemanları int olduğu için otomatik olarak 0 atanır!

        int[][] array = new int[2][2];
        array[0][0] = 10;
        array[0][1] = 20;
        array[1][0] = 30;
        array[1][1] = 40;

        int[][] array2 = {{10, 20}, {30, 40}};

        System.out.println(array[0][0]);
        System.out.println(array2[0][0]);
    }
}