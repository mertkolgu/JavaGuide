package com.javase._79.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModifyingListTest {

    public static void main(String[] args) {

        List<String> aList = new ArrayList<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        Iterator<String> listIter = aList.iterator();

        while (listIter.hasNext()) {
            System.out.println(listIter.next());
            aList.add("four");
            // java.util.ConcurrentModificationException
        }
    }
}