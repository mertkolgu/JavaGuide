package com.javase._56.thread;

public class ThreadSleepTest02 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main line 1");
        Thread.sleep(5000);
        System.out.println("main line 2");
    }
}
