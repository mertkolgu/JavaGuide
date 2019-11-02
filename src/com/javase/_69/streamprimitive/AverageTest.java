package com.javase._64.streamprimitive;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageTest {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 3, -20, -10, 200);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());
    }
}