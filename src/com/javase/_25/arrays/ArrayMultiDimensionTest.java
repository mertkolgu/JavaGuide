package com.javase._25.arrays;

import java.util.Scanner;

public class ArrayMultiDimensionTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matrisin " + (i + 1) + "," + (j + 1) + " elemanını giriniz : ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Girdiğiniz Matris");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
