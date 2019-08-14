package com.javase._45.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

        Set<String> keys = new HashSet<>();

        keys.add("key1");
        keys.add("key1");
        keys.add("key1");
        keys.add("key2");
        keys.add("key2");
        keys.add("key3");

        System.out.println(keys.size());
        // duplicate elemana izin verilmez!

        for (String str : keys)
            System.out.println(str);
    }
}