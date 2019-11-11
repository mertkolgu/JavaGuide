package com.javase._56.thread;

import java.util.Scanner;

public class ThreadTest06 {

    public static void main(String[] args) {
        WaitNotifyV2 wn = new WaitNotifyV2();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread1Fonksiyonu();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread2Fonksiyonu();
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
    }
}

class WaitNotifyV2 {
    private Object lock = new Object();

    public void thread1Fonksiyonu() {
        synchronized (lock) {
            System.out.println("Thread 1 çalışıyor...");
            System.out.println("Thread 1, Thread 2'nin kendisini uyandırmasını bekliyor...");

            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 1 uyandı, devam ediyor...");
        }
    }

    public void thread2Fonksiyonu() {
        Scanner sc = new Scanner(System.in);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            System.out.println("Thread 2 çalışıyor...");
            System.out.print("Devam etmek için bir tuşa basın...");
            sc.nextLine();

            lock.notify();
            System.out.println("Uyandırdım abi ben gidiyorum ama 2 saniye bekle...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
