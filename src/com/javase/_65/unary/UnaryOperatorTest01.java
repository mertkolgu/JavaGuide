package com.javase._65.unary;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest01 {

    // public interface UnaryOperator<T> extends Function<T, T> {
    // java.util.List
    // default void replaceAll(UnaryOperator<E> operator) {
    public static void main(String[] args) {
        List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
        System.out.println("Before: " + ell);   // Before: [-11, 22, 33, -44, 55]

        ell.replaceAll(Math::abs);
        System.out.println(ell);    // [11, 22, 33, 44, 55]

        Function<Integer, Integer> f1 = Math::abs;
        IntFunction<Integer> intFunction = Math::abs;
        UnaryOperator<Integer> f3 = Math::abs;
    }
}

// primitive versiyonları;
// public interface IntUnaryOperator { int -> int
// public interface LongUnaryOperator { long -> long
// public interface DoubleUnaryOperator { double -> double
// public interface UnaryOperator<T> extends Function<T, T> {
// public interface BinaryOperator<T> extends BiFunction<T,T,T> {
