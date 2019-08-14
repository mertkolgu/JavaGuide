package com.javase._45.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest05 {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(100);
        set.add(100);
        set.add(100);
        set.add(-200);
        set.add(600);
        set.add(400);
        set.add(500);

        System.out.println(set);
        // LinkedHashSet -> ordered bir yapıya sahiptir.
        // elemanlar eklendiği sırada tutulur.
    }
}