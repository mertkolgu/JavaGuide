package com.javase._88.methods;

public class MethodOverloadingTest02 {

    public static void skorHesapla(String isim, int puan) {
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var.");
    }

    public static void skorHesapla(int puan) {
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");
    }

    public static void skorHesapla(String isim) {
        System.out.println(isim + " adlı oyuncunun hiç puanı yok.");
    }

    public static void main(String[] args) {
        skorHesapla("Mert", 2000);
        skorHesapla(20);
        skorHesapla("Aldrin");
    }
}