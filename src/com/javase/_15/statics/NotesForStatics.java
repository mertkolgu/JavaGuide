package com.javase._15.statics;

public class NotesForStatics {
    //
}

// static -> keyword

// static variables
// static methods
// static nested class
// static initialize block
// static import

class Employee {

    private static int count = 10;  // static variable

    // instance değişkenler obje ile birlikte yaşarlar.
    // n tane Employee objesi olsun.
    // bu durumda her objenin kendine ait 1 tane age alanı/property değeri/instance değişkeni mevcuttur.

    // obje sayısından bağımsız olarak sadece 1 tane "count" static değişkeni mevcuttur.

    // static variable -> class variable
    // instance variable -> instance variable/object variable

    // java'da objeler heap memory'de yaşarlar.
    // instance değişkenler de heap memory'de yaşar.
    private int age;    // instance variable

    // static değişkenin kendisi permgen denilen özel heap bölgesinde yaşar.
    // eğer bir objeyi gösteriyorsa bu obje yine heap alanında yaşar.

    // her metodu her değişkeni static yapmak DOĞRU bir yaklaşım DEĞİLDİR!

    // static methodların kullanılacağı noktalar;
    // Utility diye ifade edilen yardımcı/pratik sınıflardır.

    // projede farklı sınıfların, farklı metotların ihtiyacı olan bir formatlama (number, date) vs. text işlemi, dosya okuma işlemi vs.
    // bu gibi işlemler için static metodları tercih ederiz ve direkt className.staticMethodName şeklinde çağırıp kullanırız.
    // bu classlar Object Oriented açısından herhangi bir hiyerarşik durum ifade etmez.
    // tamamen yardımcı/utility amaçlı classlardır.
}