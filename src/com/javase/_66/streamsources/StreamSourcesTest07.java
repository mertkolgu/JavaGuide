package com.javase._66.streamsources;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesTest07 {

    public static void main(String[] args) {
        // public static IntStream stream(int[] array) {
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5});

        // public static <T> Stream<T> stream(T[] array) {
        Stream<Integer> integerStream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});
    }
}
