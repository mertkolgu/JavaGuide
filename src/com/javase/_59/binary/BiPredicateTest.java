package com.javase._59.binary;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest {

    // public interface BiPredicate<T, U> {
    // boolean test(T t, U u);

    public static void main(String[] args) {

        BiPredicate<String, Integer> biPredicate1 = (String str, Integer i) -> str.length() > i;

        System.out.println(biPredicate1.test("hello-world", 5));
        System.out.println(biPredicate1.test("hello-world", 15));

        // boolean contains(Object o);
        BiPredicate<List<Integer>, Integer> listContains = List::contains;
        BiPredicate<List<Integer>, Integer> listContainsV2 = (List<Integer> list, Integer i) -> list.contains(i);

        List aList = Arrays.asList(10, 20, 30);
        System.out.println(listContains.test(aList, 20));
    }
}