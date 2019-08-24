package com.javase._23.arrays;

import java.util.ArrayList;

public class ArrayListTest02 {

    public static void yazdir(ArrayList<String> arrayList) {

        for (String s : arrayList)
            System.out.println(s);
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("line1");
        arrayList.add("line2");
        arrayList.add("line3");
        arrayList.add("line4");
        arrayList.add("line5");

        yazdir(arrayList);
    }
}