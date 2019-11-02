package com.javase._56.thread;

import java.util.ArrayList;
import java.util.Random;

public class SynchronizedTest04 {
    // SynchronizedTest03.java dosyasındaki geçen süreyi yarıya indirme

    public static void main(String[] args) {

        ListWorkerV2 listWorker = new ListWorkerV2();
        listWorker.calistir();
    }
}

class ListWorkerV2 {
    Random rnd = new Random();
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    // iki tane anahtar (lock) oluşturuyoruz ki süreyi yarıya indirebilelim
    // anahtarların türleri önemli değil, istediğimiz türde oluşturabiliriz
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void arrayList1DegerEkle() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            arrayList1.add(rnd.nextInt(100));
        }
    }

    public void arrayList2DegerEkle() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            arrayList2.add(rnd.nextInt(100));
        }
    }

    public void degerAta() {
        for (int i = 0; i < 1000; i++) {
            arrayList1DegerEkle();
            arrayList2DegerEkle();
        }
    }

    public void calistir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });

        long baslangic = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long bitis = System.currentTimeMillis();

        System.out.println("List1 Size : " + arrayList1.size());
        System.out.println("List2 Size : " + arrayList2.size());
        System.out.println("Geçen süre : " + (bitis - baslangic));
    }
}