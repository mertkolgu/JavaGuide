package com.javase._04.declareinterface;

public class MuhendisTest {

    public static void main(String[] args) {

        System.out.println("BİLGİSAYAR MÜHENDİSİ");
        BilgisayarMuhendisi muhendis = new BilgisayarMuhendisi(false, false);
        String[] isler = {"Vestel", "Havelsan"};
        muhendis.askerlikDurumuSorgula();
        muhendis.adliSicilSorgula();
        System.out.println(muhendis.mezuniyetOrtalamasi(2.72));
        muhendis.isTecrübesi(isler);

        System.out.println("MAKİNE MÜHENDİSİ");
        MakineMuhendisi muhendis1 = new MakineMuhendisi(true, false);
        String[] tecrube = {};
        String[] referans = {"namık"};
        muhendis1.askerlikDurumuSorgula();
        muhendis1.adliSicilSorgula();
        System.out.println(muhendis1.mezuniyetOrtalamasi(3.02));
        muhendis1.isTecrübesi(tecrube);
        muhendis1.referansGetir(referans);
        muhendis1.calis();
    }
}