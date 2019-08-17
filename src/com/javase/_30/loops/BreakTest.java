package com.javase._30.loops;

import java.util.Scanner;

public class BreakTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Sayı giriniz : ");
            int sayi = sc.nextInt();

            // klavyeden -1 girilinceye kadar döngü devam eder.
            if (sayi == -1) {
                System.out.println("Döngüden çıkılıyor...");
                break;
            }

            System.out.println("Girdiğiniz sayı = " + sayi);
        }
    }
}