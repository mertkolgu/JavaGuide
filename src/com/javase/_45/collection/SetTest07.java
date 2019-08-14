package com.javase._45.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetTest07 {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(100);
        set.add(100);
        set.add(100);
        set.add(-200);
        set.add(600);
        set.add(400);
        set.add(500);

        System.out.println(set);
        // TreeSet sorted bir yapıya sahiptir!
        // elemanları küçükten büyüğe doğru sıralar.
    }
}