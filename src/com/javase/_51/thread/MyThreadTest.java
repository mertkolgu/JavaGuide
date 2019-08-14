package com.javase._51.thread;

// 1 - java.lang.Thread sınıfını kalıt
// 2 - public void run metodunu override et!
// java.lang paketinde yer aldığı için herhangi bir import işlemine gerek yoktur.
public class MyThreadTest extends Thread {

    @Override
    public void run() {
        System.out.println("Task is starting...");
        System.out.println("Current Thread in MyThreadTest#run : " + Thread.currentThread().getName());
    }
}