package com.javase._47.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableTest01 {

    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<>();

        map.put(100, "value1");
        map.put(200, "value2");
        map.put(300, "value3");
        map.put(400, "value4");
        map.put(400, "value4-2");
        // map.put(205, null); // java.lang.NullPointerException, Hashtable'a null key, value eklenemez!

        System.out.println(map);    // {400=value4-2, 300=value3, 200=value2, 100=value1}

        for (Integer key : map.keySet())
            System.out.println("key : " + key + ", value : " + map.get(key));
        // key : 400, value : value4-2
        // key : 300, value : value3
        // key : 200, value : value2
        // key : 100, value : value1
    }
}
