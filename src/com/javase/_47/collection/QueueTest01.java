package com.javase._47.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest01 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");

        System.out.println("Kuyruğun en başındaki eleman : " + queue.peek());   // Java

        for (String s : queue)
            System.out.println(s);
        // Java
        // Python
        // Php
        // C++

        System.out.println("Kuyruğun en başındaki eleman çıkarılıyor : " + queue.poll());   // Java

        for (String s : queue)
            System.out.println(s);
        // Python
        // Php
        // C++

        // kuyruk boşsa true doluysa false döner
        System.out.println("Kuyruk Boş Mu ? : " + queue.isEmpty()); // false

        // kuyruk boşalana kadar while döngüsü devam eder
        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor : " + queue.poll());
            // Eleman çıkarılıyor : Python
            // Eleman çıkarılıyor : Php
            // Eleman çıkarılıyor : C++
        }
    }
}
