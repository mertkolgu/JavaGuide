package com.javase._47.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest06 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        // public interface List<E> extends Collection<E> {
        // E -> String
        // boolean add(E e);
        // boolean add(String e)
        // E get(int index);
        // String get(int index)

        List<Integer> numberList = new ArrayList<Integer>();
        // E -> Integer
        // boolean add(Integer e)
        // E get(int index);
        // Integer get(int index)

        // List<int> numerlist2 = new ArrayList<int>();
        // bu legal değildir!
        // E -> int olamaz! E -> Integer
        // primitive olamaz.
        // Collection'ların elemanları Object'tir.
        System.out.println(stringList.isEmpty());   // true

        stringList.add("element1");
        stringList.add("element1");
        stringList.add("element1");
        stringList.add("element2");
        stringList.add("element3");

        System.out.println(stringList.size());  // 5
        System.out.println(stringList.get(3));  // element2 -> index 0'dan başlar!
        // size doğru verilmezse java.lang.IndexOutOfBoundsException hatası alınır!

        System.out.println(stringList.contains("element2"));    // true
        System.out.println(stringList.contains("element2222")); // false

        System.out.println(stringList); // [element1, element1, element1, element2, element3]
        System.out.println(stringList.remove(0));   // element1
        System.out.println(stringList.remove("element3"));  // true

        System.out.println(stringList); // [element1, element1, element2]

        stringList.clear();
        System.out.println(stringList); // []
    }
}
