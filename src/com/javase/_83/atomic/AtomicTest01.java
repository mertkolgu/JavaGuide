package com.javase._83.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest01 {

    public static void main(String[] args) {
        AtomicInteger atomic = new AtomicInteger();
        atomic.set(10);
        atomic.getAndIncrement();   // c++;
        atomic.incrementAndGet();   // ++c;

        System.out.println(atomic); // 12
        // The classes such as AtomicInteger do not use a lock; rather, they
        // internally use volatile variables and a low-level mechanism known as
        // Compare-And-Set (CAS). For this reason, using AtomicInteger and
        // related classes is faster than using locks using synchronized
        // keyword.
    }
}

// c++ ->
// 1 - c'nin değerini oku
// 2 - c'yi bir artır
// 3 - c'nin güncel değerini yaz!
