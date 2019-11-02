package com.javase._54.predicate;

import java.util.function.Predicate;

public class PredicateTest03 {

    public static void main(String[] args) {

        Predicate<String> nullCheckPredicate = e -> e != null;
        Predicate<String> lengthCheckPredicate = e -> e.length() > 2;

        Predicate<String> andPredicate = nullCheckPredicate.and(lengthCheckPredicate);

        String t1 = null;
        String t2 = "java";
        String t3 = "hi";
        String t4 = "hello";

        // boolean test(T t);
        System.out.println(andPredicate.test(t1));
        System.out.println(andPredicate.test(t2));
        System.out.println(andPredicate.test(t3));
        System.out.println(andPredicate.test(t4));
    }
}