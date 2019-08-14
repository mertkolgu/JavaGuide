package com.javase._79.concurrentcollections;

import java.util.HashMap;
import java.util.Map;

public class ZooManagerBadTest {

    private Map<String, Object> foodData = new HashMap<String, Object>();

    public synchronized void put(String key, String value) {
        foodData.put(key, value);
    }

    public synchronized Object get(String key) {
        return foodData.get(key);
    }
}