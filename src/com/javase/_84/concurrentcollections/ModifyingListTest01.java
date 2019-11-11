package com.javase._84.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModifyingListTest01 {

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
