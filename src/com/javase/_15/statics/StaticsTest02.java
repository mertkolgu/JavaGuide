package com.javase._15.statics;

public class StaticsTest02 {

    public static void main(String[] args) {

        Seyirci seyirci = new Seyirci("mert");
        Seyirci seyirci1 = new Seyirci("namık");

        seyirci.oyunSeyret();
        seyirci1.oyunSeyret();

        System.out.println("Seyirci sayısı : " + Seyirci.getSeyirciSayisi());
        System.out.println("Seyirci sayısı : " + seyirci.getSeyirciSayisi());
        System.out.println("Seyirci sayısı : " + seyirci1.getSeyirciSayisi());
    }
}

class Seyirci {

    private String isim;
    private static int seyirciSayisi = 0;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayisi++;
    }

    public void oyunSeyret() {
        System.out.println(this.isim + " oyun seyrediyor.");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public static int getSeyirciSayisi() {
        return seyirciSayisi;
    }

    public static void setSeyirciSayisi(int seyirciSayisi) {
        Seyirci.seyirciSayisi = seyirciSayisi;
    }
}