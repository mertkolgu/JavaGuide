package com.javase._51.thread;

public class CreateThreadObjectTest {

    public static void main(String[] args) {

        MyThreadTest myThread = new MyThreadTest();
        // burada bir MyThreadTest (Thread) objesi oluşturduk.
        // şuan bir iş parçacığı (lightweight process) çalıştırmadık.

        MyRunnableTest myRunnable = new MyRunnableTest();
        // MyRunnableTest objesi oluşturduk.
        Thread t1 = new Thread(myRunnable);
        // Runnable interface'sini implements ettiğimizde yine Thread objemiz gereklidir!

        // thread'lerin state/durumları vardır.
        // burada henüz thread'ler new durumunda. canlı durumda değildir.

        System.out.println("Current Thread in main : " + Thread.currentThread());
        myRunnable.run();
        // run metodunu direkt çağırdığımızda yeni bir Thread(iş parçacığı) OLUŞMAZ/BAŞLAMAZ!
        myThread.run();
    }
}