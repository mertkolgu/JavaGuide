package com.javase._51.thread;

public class ThreadTest03 {

    public static void main(String[] args) {

        Thread printer = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 çalışıyor");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread1 yazıyor : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread1 kesintiye uğradı.");
                    }
                }
            }
        });

        printer.start();

        // bu thread sadece burada kullanbilabilir başka yerde kullanılamaz
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2 çalışıyor");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread2 yazıyor : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread2 kesintiye uğradı.");
                    }
                }
            }
        }).start();
    }
}