package com.javase._51.thread;

public class HelloWorldTest {

    public static void main(String[] args) {

        System.out.println("HelloWorld!");
        System.out.println(Thread.currentThread());
        // javada main metodu çalıştığında yeni bir thread oluşur. main thread'dir.
    }
}