package com.javase._56.thread;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class ThreadTest11 {

    public static void main(String[] args) {
        // aynı anda 1 tane thread kullanılabilir
        ExecutorService executorService = Executors.newFixedThreadPool(1);

//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                Random rnd = new Random();
//                System.out.println("Thread Çalışıyor...");
//
//                // 2000-3000 arası
//                int sure = rnd.nextInt(1000) + 2000;
//
//                try {
//                    Thread.sleep(sure);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Thread Çıkıyor...");
//            }
//        });
//        executorService.shutdown();

        // future referansını türden bağımsız kullanmak istiyorsak Future<Integer> yerine
        // Future<?> future yazmamız gerekir
        // Future<Integer> future = executorService.submit(new Callable<Integer>() {
        Future<?> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random rnd = new Random();
                System.out.println("Thread Çalışıyor...");

                int sure = rnd.nextInt(1000) + 2000;

                if (sure > 2500) {
                    throw new IOException("Thread çok uzun süre uyudu...");
                }

                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread Çıkıyor...");

                // bu dönen değeri future referansına yolluyoruz
                return sure;
            }
        });
        executorService.shutdown();

        try {
            System.out.println("Dönen Değer : " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e);
        }
    }
}
