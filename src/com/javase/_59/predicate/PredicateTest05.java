package com.javase._54.predicate;

import java.util.function.Predicate;

public class PredicateTest05 {

    public static void main(String[] args) {

        Predicate<String> p1 = String::isEmpty;
        // Predicate<String> p11 = String::length; // compile error, length metodu geriye boolean dönmez!
        // Predicate<String> p12 = String::startsWith;
        // public boolean startsWith(String prefix) {

        Predicate<String> p2 = x -> x.isEmpty();

        Predicate<String> p3 = (String x) -> {
            return x.isEmpty();
        };

        System.out.println(p3.test(""));
        System.out.println(p3.test("java"));

        // Predicate<T> # boolean test(T t);
        // java.lang.String
//        public boolean isEmpty () {
//            return value.length == 0;
//        }
    }
}