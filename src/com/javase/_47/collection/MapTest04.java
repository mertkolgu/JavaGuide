package com.javase._47.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest04 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(100, "value1");
        map.put(200, "value2");
        map.put(300, "value3");
        map.put(400, "value4");
        map.put(400, "value4-2");

        System.out.println(map);    // {400=value4-2, 100=value1, 200=value2, 300=value3}

        for (Integer key : map.keySet())
            System.out.println("key : " + key + ", value : " + map.get(key));
        // key : 400, value : value4-2
        // key : 100, value : value1
        // key : 200, value : value2
        // key : 300, value : value3
    }
}
