package com.javase._45.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");

        System.out.println("---Vektörü for ile Ekrana Basma---");
        for (String s : vector)
            System.out.println(s);

        System.out.println("---Vektörü iterator ile Ekrana Basma---");
        Iterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---Vektörü enumaration ile Ekrana Basma---");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("İlk eleman : " + vector.firstElement());
        System.out.println("Son eleman : " + vector.lastElement());
    }
}