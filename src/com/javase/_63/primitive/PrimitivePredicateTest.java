package com.javase._58.primitive;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimitivePredicateTest {

    public static void main(String[] args) {

        Predicate<Integer> predicate = i -> (i % 2) == 0;
        IntPredicate intPredicate = i -> (i % 2) == 0;

        // public static IntStream range(int startInclusive, int endExclusive) {
        IntStream.range(1, 10).filter(intPredicate).forEach(System.out::println);

        // java.util.stream.IntStream
        // IntStream filter(IntPredicate predicate);

        // java.util.stream.Stream
        // Stream<T> filter(Predicate<? super T> predicate);
    }
}

// public interface IntPredicate
// boolean test(int value);

// public interface LongPredicate
// boolean test(long value);

// public interface DoublePredicate
// boolean test(double value);

// public interface Predicate<T>
// boolean test(T t);

// However, performance can suffer when we use wrapper types: think of boxing
// and unboxing a few million integers in a stream. To avoid this performance
// problem, you can instead use relevant primitive versions of these functional
// interfaces.

// primitive versiyonları ilgili noktalarda kullanmak
// performans açısından faydalı olacaktır!