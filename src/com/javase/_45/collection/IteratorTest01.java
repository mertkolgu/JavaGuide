package com.javase._45.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class IteratorTest01 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        Iterator<String> iterator = set.iterator();
        Iterator<String> iterator1 = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************");

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}