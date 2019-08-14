package com.javase._31.exceptionhandling;

public class ExceptionHandlingTest02 {

    public static void main(String[] args) {

        // finally bloğu -> kodumuzda exception olsun ya da olmasın çalışmasını
        // istediğimiz bir kod bloğunu finally bloğu içerisine alırız.

        // close resource, clean up
        // database connection, network işlemleri, dosya okuma/yazma vs.
        // bu gibi işlemlerde kaynakların temizlenmesi/kapatılması gereklidir.
        // aksi durumda memory leak'lar, memory şişmeleri ortaya çıkabilir (OutOfMemoryError)
        // ya da veritabanı şişer isteklere cevap veremez.

        try {
            System.out.println(100 / 0);
            System.out.println("not work!");

            // kod/proje crash olur
            // catch bloğu yok
            // finally bloğu yine de çalışır!
        } finally {
            System.out.println("finally works!");
        }
        System.out.println("not work");
    }
}

// olabilecek format
// try-catchXN-finally N -> 0, 1, 2...

// TEK BAŞINA finally olamaz
// catch-finally şeklinde de olamaz