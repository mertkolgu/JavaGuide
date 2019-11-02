package com.javase._32.loops;

import java.util.Scanner;

public class DoWhileLoopTest01 {
    // sayının rakamlarının toplamını bulma
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayı giriniz : ");
        int sayi = sc.nextInt();

        do {
            toplam += sayi % 10;
            sayi /= 10;
            // System.out.println("Sayı = " + sayi);
        } while (sayi > 0);

        System.out.println("Rakamları toplamı = " + toplam);
    }
}

// do-while döngüsü koşul doğru olsa da olmasa da ilk seferde çalışır.
