package com.javase._56.thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest09 {

    public static void main(String[] args) {
        DeadlockOrnegi deadlock = new DeadlockOrnegi();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread1Fonksiyonu();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread2Fonksiyonu();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        deadlock.threadOver();
    }
}

class DeadlockOrnegi {
    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap();
    private Random random = new Random();

    // iki tane hesabımız olduğu için iki tane lock oluşturuyoruz
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void locklariKontrolEt(Lock a, Lock b) {
        boolean aEldeEdildi = false;
        boolean bEldeEdildi = false;

        while (true) {
            // iki lock elde edilene kadar döngü devam eder
            aEldeEdildi = a.tryLock();
            bEldeEdildi = b.tryLock();

            if (aEldeEdildi == true && bEldeEdildi == true) {
                return;
            }

            // a lock'unu b'ye bırakıyoruz
            if (aEldeEdildi == true) {
                a.unlock();
            }

            // b lock'unu a'ya bırakıyoruz
            if (bEldeEdildi == true) {
                b.unlock();
            }
        }
    }

    public void thread1Fonksiyonu() {
        locklariKontrolEt(lock1, lock2);

        // hesap1'den hesap2'ye para transferi
        for (int i = 0; i < 5000; i++) {
            Hesap.paraTransferi(hesap1, hesap2, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void thread2Fonksiyonu() {
        locklariKontrolEt(lock2, lock1);

        // hesap2'den hesap1'ye para transferi
        for (int i = 0; i < 5000; i++) {
            Hesap.paraTransferi(hesap2, hesap1, random.nextInt(100));
        }
        lock2.unlock();
        lock1.unlock();
    }

    public void threadOver() {
        System.out.println("Hesap1 Bakiye : " + hesap1.getBakiye());
        System.out.println("Hesap2 Bakiye : " + hesap2.getBakiye());
        System.out.println("Toplam Bakiye : " + (hesap1.getBakiye() + hesap2.getBakiye()));
    }
}

class Hesap {
    private int bakiye = 10000;

    public void paraCek(int miktar) {
        bakiye -= miktar;
    }

    public void paraYatir(int miktar) {
        bakiye += miktar;
    }

    public static void paraTransferi(Hesap hesap1, Hesap hesap2, int miktar) {
        hesap1.paraCek(miktar);
        hesap2.paraYatir(miktar);
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}