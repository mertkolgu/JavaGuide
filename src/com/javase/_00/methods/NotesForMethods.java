package com.javase._00.methods;

import java.util.Scanner;

public class NotesForMethods {

    public static void testMethod() {
        System.out.println("Hello world!");
    }

    public static void faktoriyel() {

        Scanner sc = new Scanner(System.in);
        long faktoriyel = 1;

        System.out.print("Bir sayı giriniz : ");
        int sayi = sc.nextInt();

        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }

        System.out.println("Faktöriyel = " + faktoriyel);
    }

    public static void main(String[] args) {

        testMethod();
        faktoriyel();
    }
}

// methodu bir defa tanımlarız.
// tanımladığımız metodu her yerde kullanırız.
// metodu istediğimiz kadar çağırabiliriz.
// metodları olabildiğince parçalara bölüp çalışmak faydalıdır.

// void -> geriye bir şey döndürmüyor. return kullanılamaz.
// return olan methodlarda return'den sonra hiçbir işlem yapılmaz,
// method return'e kadar işlem yapar.