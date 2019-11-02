package com.javase._47.collection;

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
        hashMap.put(50, "JavaScript");  // DİKKAT, key unique değil, yeni değer eski değeri günceller!

        System.out.println(hashMap);    // {50=JavaScript, 20=PHP, 10=Java, 30=Python}

        // girilen key'deki value'yi ekrana basar
        System.out.println(hashMap.get(20));    // PHP
        System.out.println(hashMap.get(10));    // Java
        System.out.println(hashMap.get(100));   // null

        // HashMap ekrana basma
        for (Map.Entry<Integer, String> entry : hashMap.entrySet())
            System.out.println("Anahtar : " + entry.getKey() + " ---> Değer : " + entry.getValue());
        // Anahtar : 50 ---> Değer : JavaScript
        // Anahtar : 20 ---> Değer : PHP
        // Anahtar : 10 ---> Değer : Java
        // Anahtar : 30 ---> Değer : Python
    }
}
