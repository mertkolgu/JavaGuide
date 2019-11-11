package com.javase._67.streamintermediate;

import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

public class IntermediateMapTest02 {

    public static void main(String[] args) {
        // DoubleStream # DoubleStream map(DoubleUnaryOperator mapper);
        // DoubleStream map(DoubleUnaryOperator mapper);

        // public static double sqrt(double a) {
        DoubleUnaryOperator duo = Math::sqrt;

        DoubleStream.of(1.0, 4.0, 9.0, 12.0).map(Math::sqrt).peek(System.out::println).sum();
    }
}
