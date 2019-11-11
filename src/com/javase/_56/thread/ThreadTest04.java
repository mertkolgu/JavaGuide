package com.javase._56.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadTest04 {

    public static void main(String[] args) {
        // aynı anda en fazla 2 thread çalışabilir.
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            // thread'in ne zaman çalışacağını executorService kendi belirleyecek
            executorService.submit(new Worker(String.valueOf(i), i));
        }

        // thread'lerin işi bitince executorService kapatılacak
        // executorService thread'lerimizin işi bittiği zaman mutlaka kapatmamız lazım
        executorService.shutdown();
        System.out.println("Bütün işler teslim edildi.");

        try {
            // ben burada sadece belli bir süre beklerim
            // örnek olarak ben burada en fazla 1 gün beklerim sonra kapatırım
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Bütün işler bitti.");
    }
}

class Worker implements Runnable {
    private String isim;
    private int taskId;

    public Worker(String isim, int taskId) {
        this.isim = isim;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker " + isim + " " + taskId + ". işe başladı.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker " + isim + " " + taskId + ". işi bitirdi.");
    }
}
