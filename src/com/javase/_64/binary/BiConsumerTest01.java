package com.javase._64.binary;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest01 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // void accept(T t, U u);
        // V put(K key, V value);
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map);    // {chicken=7, chick=1}
    }
}
