package com.javase._45.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");

        System.out.println("Kuyruğun en başındaki eleman : " + queue.peek());

        for (String s : queue)
            System.out.println(s);

        System.out.println("Kuyruğun en başındaki eleman çıkarılıyor : " + queue.poll());

        for (String s : queue)
            System.out.println(s);

        // kuyruk boşsa true doluysa false döner
        System.out.println("Kuyruk Boş Mu ? : " + queue.isEmpty());

        // kuyruk boşalana kadar while döngüsü devam eder
        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor : " + queue.poll());
        }
    }
}