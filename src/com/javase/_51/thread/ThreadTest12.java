package com.javase._51.thread;

public class ThreadTest12 {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");

                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread yazıyor : " + i);

                    try {
                        Thread.sleep(1000);
                        System.out.println("Uykumun " + i + ". saniyesindeyim.");
                    } catch (InterruptedException e) {
                        System.out.println("Uykum bölündü...");
                    }
                }
            }
        });

        thread.start();
        // 2 saniye sonra thread'i yarıda kesiyoruz
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}