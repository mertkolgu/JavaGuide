package com.javase._61.function;

import java.util.function.Function;

public class FunctionTest01 {

    // java.util.function.Function<T, R>
    // R apply(T t);
    public static void main(String[] args) {
        Function<String, Integer> lengthFunciton = e -> e.length();
        Function<String, Integer> lengthFunctionV2 = (String str) -> str.length();
        Function<String, Integer> lengthFunctionV3 = String::length;

        Integer result1 = lengthFunciton.apply("java");
        Integer result2 = lengthFunciton.apply("functional");
        Integer result3 = lengthFunciton.apply("integer");

        System.out.println(result1);    // 4
        System.out.println(result2);    // 10
        System.out.println(result3);    // 7
        // java.util.stream.Stream
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    }
}
