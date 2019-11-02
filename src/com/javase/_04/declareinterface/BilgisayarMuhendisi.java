package com.javase._04.declareinterface;

public class BilgisayarMuhendisi implements Muhendis {
    private boolean askerlik;
    private boolean adliSicil;

    public BilgisayarMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım.");
        } else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public void adliSicilSorgula() {
        if (adliSicil) {
            System.out.println("Adli sicil kaydım bulunuyor.");
        } else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");
        }
    }

    @Override
    public void isTecrübesi(String[] array) {
        System.out.println("Bilgisayar Mühendisi olarak şu şirketlerde çalıştım");
        for (String s : array)
            System.out.println(s);
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam : " + derece;
    }
}
