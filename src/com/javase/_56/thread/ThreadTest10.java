package com.javase._56.thread;

import java.util.concurrent.Semaphore;

public class ThreadTest10 {

    public static void main(String[] args) {
        SemaphoreOrnegi semaphore = new SemaphoreOrnegi();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(1);

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(2);

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(3);

            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(4);

            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(5);

            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SemaphoreOrnegi {

    // aynı anda 4 thread'i çalıştıracağımız için semaphore'a 4 değerini veriyoruz
    private Semaphore semaphore = new Semaphore(4);

    public void threadFonksiyonu(int id) {

        try {
            // acquire() methodu değer sıfır ise alt tarafa geçemiyor
            // ancak değer sıfırdan büyük ise alt tarafa geçiyor
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread Başlıyor... ID : " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread Çıkıyor.... ID : " + id);

        // release() methodu semaphore'un değeri sıfır ise değerini 1 artırıyor
        semaphore.release();
    }
}
