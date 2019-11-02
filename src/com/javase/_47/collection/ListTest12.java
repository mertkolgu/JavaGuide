package com.javase._47.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest12 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        nameList.add("mert");
        nameList.add("ali");
        nameList.add("ecir");

        for (int i = 0; i < nameList.size(); i++)
            System.out.println(nameList.get(i));
        // mert
        // ali
        // ecir

        System.out.println();

        for (String e : nameList)
            System.out.println(e);
        // mert
        // ali
        // ecir

        System.out.println();
        Iterator<String> iterator = nameList.iterator();

        while (iterator.hasNext()) {
            String e = iterator.next();
            System.out.println(e);
            // mert
            // ali
            // ecir
        }

        System.out.println();

        ListIterator<String> listIterator = nameList.listIterator();

        while (listIterator.hasNext()) {
            String e = listIterator.next();
            System.out.println(e);
            // mert
            // ali
            // ecir
        }

        System.out.println();

        while (listIterator.hasPrevious()) {
            String e = listIterator.previous();
            System.out.println(e);
            // ecir
            // ali
            // mert
        }
    }
}
