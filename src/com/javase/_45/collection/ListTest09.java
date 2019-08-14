package com.javase._45.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest09 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        // coding to interface
        // sol taraf List -> interface
        // sağ taraf ArrayList -> class

        list1 = new LinkedList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        // list2 = new LinkedList<>();   //compiler error!
    }
}