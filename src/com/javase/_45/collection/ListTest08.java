package com.javase._45.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest08 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(1, 1000);

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        list2.add(500);
        list2.add(600);
        list1.addAll(list2);

        System.out.println(list1);
        System.out.println(list2);

        list1.removeAll(list2);
        System.out.println(list1);
    }
}