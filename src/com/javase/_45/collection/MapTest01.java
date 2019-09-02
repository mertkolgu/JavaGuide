package com.javase._45.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "PHP");
        hashMap.put(20, "PHP");
        hashMap.put(20, "PHP");
        hashMap.put(50, "JavaScript");

        System.out.println(hashMap);

        // girilen key'deki value'yi ekrana basar
        System.out.println(hashMap.get(20));
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(100));   // null

        // HashMap ekrana basma
        for (Map.Entry<Integer, String> entry : hashMap.entrySet())
            System.out.println("Anahtar : " + entry.getKey() + " ---> Değer : " + entry.getValue());
    }
}