package com.javase._45.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest13 {

    public static void listeyiBastir(List<String> gidilecekYerler) {
        Iterator<String> iterator = gidilecekYerler.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void siraliEkle(List<String> gidilecekYerler, String yeni) {
        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()) {
            int karsilastir = iterator.next().compareTo(yeni);

            if (karsilastir == 0) {
                // iki değer eşit
                System.out.println("Listenizde zaten bu eleman var.");
                return;
            } else if (karsilastir < 0) {
                // yeni değer iterator.next'ten daha büyük
            } else if (karsilastir > 0) {
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }

    public static void main(String[] args) {

        List<String> gidilecekYerler = new LinkedList<>();
        siraliEkle(gidilecekYerler, "Postane");
        siraliEkle(gidilecekYerler, "Market");
        siraliEkle(gidilecekYerler, "Ev");
        siraliEkle(gidilecekYerler, "Hastane");

        listeyiBastir(gidilecekYerler);
    }
}