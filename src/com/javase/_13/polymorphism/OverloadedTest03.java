package com.javase._13.polymorphism;

class Overloading {
    public static void skorHesapla(String isim, int puan) {
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var.");
    }

    public static void skorHesapla(int puan) {
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");
    }

    public static void skorHesapla(String isim) {
        System.out.println(isim + " adlı oyuncunun hiç puanı yok.");
    }
}

public class OverloadedTest03 {

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.skorHesapla("Mert", 2000);
        overloading.skorHesapla(20);
        overloading.skorHesapla("Aldrin");
    }
}
