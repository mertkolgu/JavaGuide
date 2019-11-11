package com.javase._61.function;

import java.util.function.Function;

public class FunctionTest05 {

    public static void main(String[] args) {
        // public int length() {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck"));  // 5
        System.out.println(f2.apply("cluck"));  // 5
        // Function<String, String> f3 = String::concat;
        // public String concat(String str) {
    }
}
