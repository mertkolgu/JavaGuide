package com.javase._45.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest02 {

    public static void main(String[] args) {

        Queue<People> queue = new PriorityQueue<>();

        queue.offer(new People("Mert", 5));
        queue.offer(new People("Mehmet", 1));
        queue.offer(new People("Ecir", 100));

        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor : " + queue.poll());
        }
    }
}

class People implements Comparable<People> {
    private String isim;
    private int id;

    public People(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "People{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(People people) {
        // en küçük id en yüksek önceliğe sahip olacak
        if (this.id < people.id) {
            return -1;
        } else if (this.id > people.id) {
            return 1;
        }
        return 0;
    }
}