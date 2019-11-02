package com.javase._50.generics;

public class GenericsTest01 {

    public static void main(String[] args) {
        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
        Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);

        EsitAgirlik esitAgirlik1 = new EsitAgirlik(30, 20, 40, 2);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(40, 10, 50, 0);

        Sayisal birinci = birinci(sayisal1, sayisal2);
        System.out.println("Birinci Sayısal Öğrencinin Puanı : " + birinci.puanHesapla());

        EsitAgirlik birinci2 = birinci(esitAgirlik1, esitAgirlik2);
        System.out.println("Birinci Eşit Ağırlık Öğrencinin Puanı : " + birinci2.puanHesapla());
    }

    // aday class'ını extend eden class'ları gönderiyorum
    public static <E extends Aday> E birinci(E e1, E e2) {   // generic method
        if (e1.puanHesapla() > e2.puanHesapla()) {
            return e1;
        } else {
            return e2;
        }
    }
}

abstract class Aday {
    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;

    public Aday(int turkce, int matematik, int edebiyat, int fizik) {
        this.turkce = turkce;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
    }

    abstract int puanHesapla();

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }
}

class Sayisal extends Aday {
    public Sayisal(int turkce, int matematik, int edebiyat, int fizik) {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;
    }
}

class EsitAgirlik extends Aday {
    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik) {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }
}
