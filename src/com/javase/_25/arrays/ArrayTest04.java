package com.javase._25.arrays;

public class ArrayTest04 {

    public static void diziBastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanı : " + array[i]);
        }
    }

    public static double ortalamaBul(int[] array) {
        int toplam = 0;

        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return ((double) toplam / array.length);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 54, 66, 77, 88, 40};
        diziBastir(array);
        System.out.println("Dizinin Ortalaması = " + ortalamaBul(array));
    }
}
