package com.javase._47.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        ListIterator<String> iterator = list.listIterator();

        // listeyi normal basma
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // Java
            // Python
            // C++
            // Go
        }

        System.out.println("**************");

        // listeyi tersten basma
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
            // Go
            // C++
            // Python
            // Java
        }

        System.out.println("**************");

        // listeden istenilen değeri silme
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equalsIgnoreCase("Go")) {
                iterator.remove();
            }
        }

        for (String s : list)
            System.out.println(s);
        // Java
        // Python
        // C++
    }
}
