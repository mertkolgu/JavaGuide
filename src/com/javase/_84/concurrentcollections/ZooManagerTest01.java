package com.javase._84.concurrentcollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManagerTest01 {
    private Map<String, String> foodData = new ConcurrentHashMap<>();
    // scynchronized kullanmak yerine ConcurrentHashMap kullanmak daha iyi bir yaklaşım olacaktır!

    public void put(String key, String value) {
        foodData.put(key, value);
    }

    public String get(String key) {
        return foodData.get(key);
    }
}
