package com.javase._63.primitive;

import java.util.function.Function;
import java.util.function.IntFunction;

public class PrimitiveFunctionTest01 {

    public static void main(String[] args) {
        // public interface Function<T, R> {
        // R apply(T t);

        // public interface IntFunction<R> {
        // R apply(int value);

        // public interface LongFunction<R> {
        // R apply(long value);

        // public interface DoubleFunction<R> {
        // R apply(double value);
        Function<Integer, Integer> absInt = Math::abs;
        IntFunction<Integer> absIntV2 = Math::abs;
    }
}
