package com.javase._53.anonymousinnerclass;

public class AnonymousInnerClassTest03 {

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci() {
            @Override
            public void dersCalis() {
                System.out.println("Ders çalışıyorum.");
            }

            @Override
            public void derseGir() {
                System.out.println("Derse giriyorum.");
            }
        };
        ogrenci.dersCalis();
        ogrenci.derseGir();
        System.out.println("***************************");

        AOgrenci aOgrenci = new AOgrenci("Mert", 2022) {
            @Override
            void kayitYaptir() {
                System.out.println("Kayıt yapılıyor. İsim : " + getIsim() + " Numara : " + getNumara());
            }
        };
        aOgrenci.kayitYaptir();
        aOgrenci.selamla();
    }

    public interface Ogrenci {
        void dersCalis();
        void derseGir();
    }

    public abstract static class AOgrenci {
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        abstract void kayitYaptir();

        public void selamla() {
            System.out.println("Selamlar...");
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
    }
}
