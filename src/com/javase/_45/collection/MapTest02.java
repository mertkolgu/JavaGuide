package com.javase._45.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collection;

public class MapTest02 {

    public static void mapYazdir(Map<Integer, String> map) {
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "PHP");
        map.put(100, "C");

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println("Key : " + entry.getKey() + " ---> Value : " + entry.getValue());

        // sadece key'leri ekrana basma
        // System.out.println(map.keySet());

        // map'i ekrana basma farklı yol
        // for (Integer key : map.keySet())
        //     System.out.println("Key : " + key + " ---> Value : " + map.get(key));

        // sadece value'leri ekrana basma
        // Collection<String> values = map.values();

        // for (String s : values)
        //     System.out.println("Değer : " + s);
    }

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("-------HashMap-------");
        mapYazdir(hashMap);
        System.out.println("-------LinkedHashMap-------");
        mapYazdir(linkedHashMap);
        System.out.println("-------TreeMap-------");
        mapYazdir(treeMap);
    }
}