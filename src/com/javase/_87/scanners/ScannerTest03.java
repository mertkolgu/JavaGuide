package com.javase._87.scanners;

import java.util.Scanner;

public class ScannerTest03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz : ");
        int yas = sc.nextInt();

        sc.nextLine();  // dummy input

        System.out.print("Adınızı Giriniz : ");
        String isim = sc.nextLine();

        System.out.println("Yaşınız : " + yas);
        System.out.println("Adınız : " + isim);
    }
}

// nextInt'ten sonra nextLine almaya çalışırken araya
// nextLine eklememiz lazım yoksa nextLine çalışmaz.