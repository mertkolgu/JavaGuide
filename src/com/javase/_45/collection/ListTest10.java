package com.javase._45.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest10 {

    public static void main(String[] args) {

        String[] nameArray = {"ibrahim", "mert", "necati"};

        List<String> nameList = Arrays.asList(nameArray);
        System.out.println(nameList);

        // nameList.add("java");   // java.lang.UnsupportedOperationException
        // nameList.remove(0); // java.lang.UnsupportedOperationException

        nameList.set(2, "mert.kolgu");

        System.out.println(nameArray[2]);
        System.out.println(nameArray.length);

        List<String> list1 = Arrays.asList("e1", "f1", "g1");
        List<String> nameList2 = new ArrayList<>();

        for (String e : nameArray)
            nameList2.add(e);

        nameList2.add("new element");
        System.out.println(nameList2);
    }
}