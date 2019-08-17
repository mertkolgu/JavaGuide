package com.javase._29.flowcontrol;

import java.util.Scanner;

public class IfElseTest01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lüften bir sayı giriniz : ");
        int sayi = sc.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayı.");
        } else if (sayi == 0) {
            System.out.println("Sayı sıfıra eşit.");
        } else {
            System.out.println("Pozitif sayı.");
        }
    }
}