package com.javase._56.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest07 {

    public static void main(String[] args) {

        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();

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

class ReentrantLockExample {
    private int say = 0;
    private Lock lock = new ReentrantLock();

    public void artir() {
        for (int i = 0; i < 10000; i++)
            say++;
    }

    public void thread1Fonksiyonu() {
        // burada lock'u kilitliyoruz başka kimse kullanamıyor
        lock.lock();
        try {
            artir();
        } finally {
            // burada lock'u başkasına teslim ediyoruz
            lock.unlock();
        }
        // lock() ve unlock() arasında herhangi bir exception oluşursa program sonsuza kadar kilitlenebilir
        // bunun önüne şöyle geçiyoruz; exception oluşacak yerleri try-catch bloğuna alıyoruz ve
        // unlock() methodunu finally kısmına yazıyoruz
    }

    public void thread2Fonksiyonu() {
        lock.lock();
        try {
            artir();
        } finally {
            lock.unlock();
        }
    }

    public void threadOver() {
        System.out.println("Say Değişkeninin Değeri : " + say);
    }
}