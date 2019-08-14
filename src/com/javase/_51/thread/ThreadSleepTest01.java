package com.javase._51.thread;

public class ThreadSleepTest01 {

    public static void main(String[] args) {

        RunnableImp r1 = new RunnableImp();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class RunnableImp implements Runnable {

    @Override
    // override metotlar için yeni bir checked exception eklenemez!
    // yani burada throws InterruptedException olamaz!
    public void run() {

        System.out.println("Thread name : " + Thread.currentThread().getName());

        try {
            // burada mecbur olarak try-catch kullanmamız gereklidir!
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   // 500 ms -> 0.5 saniye
    }
}