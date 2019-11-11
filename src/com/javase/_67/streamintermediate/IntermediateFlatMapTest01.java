package com.javase._67.streamintermediate;

import java.util.Arrays;

public class IntermediateFlatMapTest01 {

    public static void main(String[] args) {
        String[] string = "you never know what you have until you clean your room".split(" ");

        Arrays.stream(string).map(word -> word.split("")).distinct().forEach(System.out::println);

        System.out.println();
        Arrays.stream(string).flatMap(word -> Arrays.stream(word.split(""))).distinct().forEach(System.out::println);
    }
}
