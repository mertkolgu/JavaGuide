package com.javase._45.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {

    public static void main(String[] args) {

        List numbers1 = new ArrayList();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);
        numbers1.add(40);

        List numbers2 = new ArrayList();

        numbers2.addAll(numbers1);
        numbers2.add(0, 200);
        System.out.println(numbers2);

        numbers2.removeAll(numbers1);
        System.out.println(numbers2);

        System.out.println(numbers1);
    }
}