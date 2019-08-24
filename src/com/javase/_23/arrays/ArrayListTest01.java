package com.javase._23.arrays;

import java.util.ArrayList;

public class ArrayListTest01 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        // listeye eleman ekleme
        arrayList.add("line1");
        arrayList.add("line2");
        arrayList.add("line3");
        arrayList.add("line4");
        arrayList.add("line5");
        arrayList.add("line1");

        // listeden eleman silme
        // arrayList.remove(4);
        // arrayList.remove("line2");

        // listeyi baştan başlayarak tarar ve ilk "line1"e rastladığı indeksi yazar
        System.out.println(arrayList.indexOf("line1"));
        System.out.println(arrayList.indexOf("line8")); // listede yok, -1 döner

        // listeyi sondan başlayarak tarar ve ilk "line1"e rastladığı indeksi yazar
        System.out.println(arrayList.lastIndexOf("line1"));

        // listenin istenilen indisindeki elemanı gösterme
        System.out.println(arrayList.get(1));

        // listenin boyutunu gösterme
        System.out.println(arrayList.size());

        // belirtilen indisteki elemanı değiştirir
        arrayList.set(2, "mert");

        for (String s : arrayList)
            System.out.println(s);
    }
}