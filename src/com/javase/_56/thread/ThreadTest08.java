package com.javase._56.thread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest08 {

    public static void main(String[] args) {

        ReentrantLockExampleV2 reentrantLockExample = new ReentrantLockExampleV2();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockExample.thread1Fonksiyonu();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockExample.thread2Fonksiyonu();
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

        reentrantLockExample.threadOver();
    }
}

class ReentrantLockExampleV2 {
    private int say = 0;
    private Lock lock = new ReentrantLock();
    // lock üzerinde herhangi bir wait/notify işlemi yapabilmemiz için condition oluşturmamız gerekiyor
    private Condition condition = lock.newCondition();

    public void artir() {
        for (int i = 0; i < 10000; i++)
            say++;
    }

    // thread1 beklerken thread2 gelip thread1'i uyandırsın
    public void thread1Fonksiyonu() {
        lock.lock();

        System.out.println("Thread 1 çalışıyor...");
        System.out.println("Thread 1 uyandırılmayı bekliyor...");

        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 1 uyandırıldı ve işlemine devam ediyor...");
        artir();
        lock.unlock();
    }

    public void thread2Fonksiyonu() {
        // thread2 lock'u almadan önce 1 sn uyusun
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);

        lock.lock();

        System.out.println("Thread 2 çalışıyor...");
        artir();

        System.out.print("Devam etmek için bir tuşa basın...");
        sc.nextLine();
        condition.signal();
        System.out.println("Thread 1'i uyandırdım. Ben gidiyorum...");
        lock.unlock();
    }

    public void threadOver() {
        System.out.println("Say Değişkeninin Değeri : " + say);
    }
}