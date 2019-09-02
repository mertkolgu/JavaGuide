package com.javase._45.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest01 {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);

        // PriorityQueue düzgün sıralı olarak ekrana basmak istersek for-each döngüsünü kullanamayız
        // for (Integer i : queue)
        //     System.out.println(i);

        System.out.println("Kuyruğun ilk elemanı : "+ queue.peek());
        System.out.println("Kuyruk içinde 100 değeri var mı ? : " + queue.contains(100));

        // PriorityQueue düzgün sıralı olarak ekrana basılması
        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor : " + queue.poll());
        }

        queue.clear();  // kuyruğu temizledi

        System.out.println("Kuyruk boş mu ? : " + queue.isEmpty());
    }
}