package com.javase._23.arrays;

import java.util.Arrays;

public class ArrayTest06 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        if (array1 == array2) {
            System.out.println("Eşitler.");
        } else {
            System.out.println("Eşit değiller.");
        }

        if (Arrays.equals(array1, array2)) {
            System.out.println("Eşitler.");
        } else {
            System.out.println("Eşit değiller.");
        }
    }
}

// iki dizinin içeriğini kıyaslamak için Arrays.equals kullanılır.
// geriye true ya da false döner.