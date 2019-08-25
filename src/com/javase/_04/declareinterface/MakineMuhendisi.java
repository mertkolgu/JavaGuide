package com.javase._04.declareinterface;

public class MakineMuhendisi implements Muhendis, Calisma {

    private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    public void referansGetir(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir iş referansım bulunmuyor.");
        } else {
            System.out.println("Referanslarım");
            for (String s : array)
                System.out.println(s);
        }
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
        if (array.length == 0) {
            System.out.println("Herhangi bir iş tecrübem bulunmuyor.");
        } else {
            System.out.println("Makine Mühendisi olarak şu şirketlerde çalıştım");
            for (String s : array)
                System.out.println(s);
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam : " + derece;
    }

    @Override
    public void calis() {
        System.out.println("Makine Mühendisi çalışıyor.");
    }
}