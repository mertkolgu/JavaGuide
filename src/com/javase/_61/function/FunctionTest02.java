package com.javase._61.function;

import java.util.function.Function;

public class FunctionTest02 {

    public static void main(String[] args) {
        Function<String, Integer> f1 = str -> Integer.parseInt(str);
        Function<String, Integer> f2 = Integer::parseInt;

        // public static int parseInt(String s)
        // public interface Function<T, R> {
        // R apply(T t);

        System.out.println(f1.apply("200"));
        System.out.println(f2.apply("400"));

        // public static int abs(int a) {
        Function<Integer, Integer> f3 = Math::abs;

        // public static long abs(long a) {
        Function<Long, Long> f4 = Math::abs;
    }
}
