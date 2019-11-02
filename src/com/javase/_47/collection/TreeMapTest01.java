package com.javase._47.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest01 {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        // TreeMap'te key'e göre sıralanır!
        map.put(100, "value1");
        map.put(200, "value2");
        map.put(300, "value3");
        map.put(400, "value4");
        map.put(400, "value4-2");
        map.put(205, null);

        System.out.println(map);    // {100=value1, 200=value2, 205=null, 300=value3, 400=value4-2}

        for (Integer key : map.keySet())
            System.out.println("key : " + key + ", value : " + map.get(key));
        // key : 100, value : value1
        // key : 200, value : value2
        // key : 205, value : null
        // key : 300, value : value3
        // key : 400, value : value4-2

        // key olarak kullanılan sınıf Comparable olmalıdır!
        // Integer IS-A Comparable
        // String IS-A Comparable
    }
}
