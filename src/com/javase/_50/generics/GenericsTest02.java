package com.javase._50.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest02 {

    public static void main(String[] args) {
        List<Integer> genericList = new ArrayList<>();  // compile time
        // List genericList = new ArrayList();  // run time
        // runtime type bilgisi uçar!

        // NOT: Collectionların elemanları objedir.
        // Generic yapısı compile time/derleme zamanında koruma sağlar.
        genericList.add(10);
        genericList.add(20);
        genericList.add(30);
        // genericList.add("legal or illegal");
        addElement(genericList);

        System.out.println(genericList);    // [10, 20, 30, legal or illegal]

        // java.lang.ClassCastException
        for (Integer i : genericList)
            System.out.println(i);
    }

    // NOT: yeni metotlar kullanıldığında her zaman GENERIC yapıyı kullan.
    // non-generic ile generic listler/metotlar birlikte kullanılırsa patlama riski vardır!
    public static void addElement(List nonGeneric) {
        nonGeneric.add("legal or illegal");
    }
}
