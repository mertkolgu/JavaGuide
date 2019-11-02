package com.javase._25.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest05 {

    public static int[] diziDoldur(int sayi) {
        Scanner sc = new Scanner(System.in);
        int[] cikti = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            cikti[i] = sc.nextInt();
        }
        return cikti;
    }

    public static void diziBas(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("Dizinin " + (i + 1) + ". elemanı : " + array[i]);
    }

    public static void arraySort(int[] array) {
        // dizi sıralama metodu
        Arrays.sort(array);
        diziBas(array);
    }

    public static void main(String[] args) {
        int[] array = diziDoldur(5);
        diziBas(array);
        System.out.println("**********************");
        arraySort(array);
    }
}
