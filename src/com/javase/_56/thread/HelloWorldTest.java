package com.javase._56.thread;

public class HelloWorldTest {

    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        System.out.println(Thread.currentThread()); // Thread[main,5,main]
        // javada main metodu çalıştığında yeni bir thread oluşur. main thread'dir.
    }
}
