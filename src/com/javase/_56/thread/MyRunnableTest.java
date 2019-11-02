package com.javase._56.thread;

// 1 - java.lang.Runnable interface'sini implements et
// 2 - run metodunu override et
public class MyRunnableTest implements Runnable {

    @Override
    public void run() {
        System.out.println("Task is starting...");
        System.out.println("Current Thread in MyRunnableTest#run : " + Thread.currentThread().getName());
    }
}
