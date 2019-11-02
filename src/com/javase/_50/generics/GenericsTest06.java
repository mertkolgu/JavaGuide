package com.javase._50.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest06 {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        listRuleV4(numbers);
        // listRuleV5(numbers);    // compile error
        // List<Object>

        listRuleV4(objects);
        listRuleV5(objects);
    }

    public static void listRuleV4(List<?> list) {
        // bu metotta list'e yeni eleman eklenemez!!
    }

    public static void listRuleV5(List<Object> objectList) {
        objectList.add(100);
        objectList.add("key");
    }
}
