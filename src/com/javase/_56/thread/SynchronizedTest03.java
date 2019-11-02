package com.javase._56.thread;

import java.util.ArrayList;

public class SynchronizedTest03 {

    public static void main(String[] args) {
        ListWorker listWorker = new ListWorker();
        long baslangic = System.currentTimeMillis();

        listWorker.degerAta();

        long bitis = System.currentTimeMillis();

        System.out.println("Geçen süre : " + (bitis - baslangic));
    }
}

class ListWorker {
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();

    public void arrayList1DegerEkle() {
        for (int i = 0; i < 2000; i++) {
            try {
                arrayList1.add(i);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void arrayList2DegerEkle() {
        for (int i = 0; i < 2000; i++) {
            try {
                arrayList2.add(i);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void degerAta() {
        arrayList1DegerEkle();
        arrayList2DegerEkle();

        System.out.println("List1 Size : " + arrayList1.size());
        System.out.println("List2 Size : " + arrayList2.size());
    }
}