package com.javase._32.loops;

import java.util.Scanner;

public class ForLoopTest03 {
    // Faktöriyel hesaplama
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faktoriyel = 1;

        System.out.print("Sayı giriniz : ");
        int sayi = sc.nextInt();

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
            // System.out.println("Faktöriyel = " + faktoriyel + " - i = " + i);
        }
        System.out.println("Faktöriyel = " + faktoriyel);
    }
}
