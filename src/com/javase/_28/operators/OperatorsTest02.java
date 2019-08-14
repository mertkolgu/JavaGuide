package com.javase._28.operators;

public class OperatorsTest02 {

    public static void main(String[] args) {

        // boolean değişkenler için == kullanmak hataya neden olabilir

        boolean b = false;

        // riskli hatalı yaklaşım
        if (b = true) { // DİKKAT burada = operatörü kullanıldı == DEĞİL!
            // amaç burada değişkenin değeri true mu?
            // fakat == yerine = kullandığımızda assignment yapıyoruz!
            // dolayısıyla bu değişken her zaman true olacaktır.
            // her zaman bu if bloğu çalışacaktır.
            System.out.println("if works");
            // boolean değişkenler için == kontrolünü kullanma
        } else {
            System.out.println("else works");
        }

        // DOĞRU YAKLAŞIM
        if (b) {
            //
        }

        int x = 10;
        // burada == yerine = yaparsak derleme hatası alırız
        // hatamızı görürüz burada hemen
//        if (x = 20) {
//            //
//        }
    }
}