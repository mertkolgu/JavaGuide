package com.javase._45.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest09 {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        // HashSet
        set1.add("Java");
        set1.add("Ptyhon");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("PHP");

        // LinkedHashSet
        set2.add("Java");
        set2.add("Ptyhon");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("PHP");

        // TreeSet
        set3.add("Java");
        set3.add("Ptyhon");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("PHP");

        // contains set'in içinde var mı yok mu arar. true ya da false döner.
        System.out.println("Setin içinde Go var mı ? : " + set1.contains("Go"));
        System.out.println("Setin içinde Java var mı ? : " + set1.contains("Java"));

        // isEmpty set'in dolu olup olmadığını gösterir. true ya da false döner.
        System.out.println("Set boş mu ? : " + set1.isEmpty());

        // remove istenilen değeri siler.
        set1.remove("Java");
        for (String s : set1)
            System.out.println(s);
    }
}