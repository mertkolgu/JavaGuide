package com.javase._47.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest01 {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");

        System.out.println("---Vektörü for ile Ekrana Basma---");
        for (String s : vector)
            System.out.println(s);
        // Java
        // Python
        // Python
        // Php

        System.out.println("---Vektörü iterator ile Ekrana Basma---");
        Iterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // Java
            // Python
            // Python
            // Php
        }

        System.out.println("---Vektörü enumaration ile Ekrana Basma---");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
            // Java
            // Python
            // Python
            // Php
        }
        System.out.println("İlk eleman : " + vector.firstElement());    // Java
        System.out.println("Son eleman : " + vector.lastElement());     // php
    }
}


