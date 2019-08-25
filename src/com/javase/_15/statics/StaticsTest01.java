package com.javase._15.statics;

public class StaticsTest {

    String name = "mert";   // bu instance değişkendir.
    // instance değişken objeye aittir.
    // ortada bir obje olacak ki bu objeye ait değişken (instance değişken) olsun.

    public static void main(String[] args) {

        // hangi objenin name alanı?
        // ortada bir obje yok!
        // static metottan direkt olarak instance metoda ya da instance değişkene erişim sağlanamaz.
        // çünkü ortada bir obje yok!
        // System.out.println(name);

        StaticsTest test = new StaticsTest();
        System.out.println(test.name);
        test.name = "new name";
        System.out.println(test.name);
        test.testMethod();

        // this.name = "not legal";
        // static metotta this ifadesini bu şekilde kullanamayız.

    }

    // bu metoda erişim olduğu noktada ortada bir obje olacak
    // dolayısıyla obje varsa instance değişken de vardır!
    // obje yoksa instance değişkenin varlığından söz edemeyiz.

    private void testMethod() {
        // this -> ifadesi kullanılabilir
        // this -> current object ifade eder
        System.out.println(this.name);
        // legaldir.
    }
}