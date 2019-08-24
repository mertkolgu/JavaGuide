package com.javase._25.wrapper;

import java.util.ArrayList;

public class NotesForWrapper {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            arrayList.add(Integer.valueOf(i));  // AutoBoxing

        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i).intValue());    // UnBoxing

        // Java, AutoBoxing ve UnBoxing işlemlerini otomatik olarak kendisi yapıyor.

        for (int i = 0; i < 10; i++)
            arrayList.add(i);   // Integer.valueOf(i)

        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));   // arrayList.get(i).intValue()
    }
}

// wrapper -> sarmalayan, sarıcı gibi Türkçe anlamları var

// 8 tane primitive tiplerimiz
// byte, short, int, long, float, double, char, boolean
// bunlara karşılık gelen sınıflar -> Wrapper sınıflar adı verilmektedir.

// Integer, Long, Float, Double, Character, Boolean, Byte, Short
// - final classlardır

// Byte, Short, Integer, Long, Float, Double sınıfları Number sınıfını kalıtır.
// java.lang paketinde yer alır.
// bunları import etmemize gerek yoktur. Java'da otomatik olarak java.lang paketi import edilir.
// IS-A Object

// AutoBoxing / Boxing
// primitive -> Reference type/Wrapper

// AutoUnboxing / Unboxing
// Wrapper -> primitive