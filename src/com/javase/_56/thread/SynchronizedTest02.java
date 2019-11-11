package com.javase._56.thread;

public class SynchronizedTest02 {
    private int count = 0;

    public synchronized void artir() {
        count++;
    }

    public void threadleriCalistir() {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    artir();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    artir();
                }
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

        System.out.println("Count değişkeninin değeri : " + count);
    }

    public static void main(String[] args) {
        SynchronizedTest02 synchronizedTest02 = new SynchronizedTest02();
        synchronizedTest02.threadleriCalistir();
    }
}