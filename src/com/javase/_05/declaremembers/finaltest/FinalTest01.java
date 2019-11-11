package com.javase._05.declaremembers.finaltest;

public class FinalTest01 {

    public static void main(String[] args) {
        Final finalTest1 = new Final("Obje 1");
        Final finalTest2 = new Final("Obje 2");

        System.out.println("Obje Sayısı : " + finalTest1.objeSayisi);
        System.out.println("Obje Sayısı : " + finalTest2.objeSayisi);
    }
}

class Final {
    public final int objeSayisi;
    private static int say = 0;
    private final String isim;

    public Final(String isim) {
        this.isim = isim;
        say++;
        objeSayisi = say;
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        Final.say = say;
    }
}
