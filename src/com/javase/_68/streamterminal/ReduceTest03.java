package com.javase._68.streamterminal;

import java.util.stream.IntStream;

public class ReduceTest03 {

    public static void main(String[] args) {
        // int reduce(int identity, IntBinaryOperator op);
        int sumTotal = IntStream.of(10, 20, 30, 40).reduce(200, ((sum, val) -> sum + val));

        System.out.println(sumTotal);   // 300
    }
}
