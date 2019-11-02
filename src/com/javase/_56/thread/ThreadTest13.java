package com.javase._56.thread;

import java.util.LinkedList;
import java.util.List;

public class ThreadTest13 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");

                for (int i = 0; i < 10000000; i++) {
                    // thread'de herhangi bir interrupt varsa true yoksa false dönecek
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Kesintiye uğradı...");
                        return;
                    }
                    list.add(i);
                }

                System.out.println("Thread kesintiye uğramadan işini bitirdi...");
            }
        });

        thread.start();
        // for döngüsü 2 saniyeden fazla işlem yaparsa kesintiye uğrar
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}