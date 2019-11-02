package com.javase._25.arrays;

import java.util.Scanner;

public class ArrayTest02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanı = " + array[i]);
        }
    }
}
