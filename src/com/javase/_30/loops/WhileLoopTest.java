package com.javase._30.loops;

import java.util.Scanner;

public class WhileLoopTest {

    // faktöriyel hesaplama

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int faktoriyel = 1;

        System.out.print("Sayı giriniz : ");
        int sayi = sc.nextInt();

        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }

        System.out.println("Faktöriyel = " + faktoriyel);
    }
}