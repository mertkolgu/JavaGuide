package com.javase._79.concurrentcollections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWListTest {

    public static void main(String[] args) {

        List<String> aList = new CopyOnWriteArrayList<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        Iterator<String> listIter = aList.iterator();

        while (listIter.hasNext()) {
            System.out.println(listIter.next());
            aList.add("four");
        }

        System.out.println(aList);
    }
}

// You should use a concurrent collection class anytime that you are going to
// have multiple threads modify a collections object outside a synchronized
// block or method, even if you don’t expect a concurrency problem.