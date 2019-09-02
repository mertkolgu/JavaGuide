package com.javase._45.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest14 {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        zamanHesapla("Linked List", linkedList);
        zamanHesapla("Array List", arrayList);
    }

    public static void zamanHesapla(String veriTipi, List<Integer> list) {
        // List'in sonuna değer ekleme
        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // bu durumda linked list daha performanslıdır
            list.add(0, i);

            // bu durumda array list daha performanslıdır
            // list.add(i);
        }

        bitis = System.currentTimeMillis();

        System.out.println(veriTipi + " ekleme süresi : " + (bitis - baslangic) + " ms");
    }
}