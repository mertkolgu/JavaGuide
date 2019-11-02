package com.javase._64.streamprimitive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntTest {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("2", "3", "5");
        IntStream intStream = stream.mapToInt((String str) -> Integer.parseInt(str));
        System.out.println(intStream.sum());
    }
}