package com.javase._05.declaremembers.abstracttest;

public abstract class Sekil {

    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }

    public void isimSoyle() {
        System.out.println("Bu obje " + this.isim + " objesidir.");
    }

    abstract void alanHesapla();

    public static void main(String[] args) {

        // Sekil sekil = new Sekil("sekil");    // obje oluşturamayız
        Kare kare = new Kare("Kare", 5);
        Daire daire = new Daire("Daire", 3);

        kare.alanHesapla();
        kare.cevreHesapla();
        daire.alanHesapla();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

class Kare extends Sekil {

    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    public void cevreHesapla() {
        System.out.println(getIsim() + " çevresi " + (4 * kenar) + " dir.");
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + " alanı " + (kenar * kenar) + " dir.");
    }
}

class Daire extends Sekil {

    private int yariCap;

    public Daire(String isim, int yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + " alanı " + (Math.PI * yariCap * yariCap) + " dir.");
    }
}