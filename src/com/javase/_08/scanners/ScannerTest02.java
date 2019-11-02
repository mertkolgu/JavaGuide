package com.javase._08.scanners;

import java.util.Scanner;

public class ScannerTest02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");

        if (sc.hasNextInt()) {
            int sayi = sc.nextInt();
            System.out.println("Girdiğiniz Sayı : " + sayi);
        } else {
            System.out.println("Lütfen bir sayı giriniz!");
        }
    }
}
