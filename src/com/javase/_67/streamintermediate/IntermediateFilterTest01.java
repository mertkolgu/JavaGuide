package com.javase._62.streamintermediate;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntermediateFilterTest01 {

    public static void main(String[] args) {

        IntStream.rangeClosed(0, 15).filter(i -> i % 2 == 0).forEach(System.out::println);

        // IntStream filter(IntPredicate predicate);
        // Stream<T> filter(Predicate<? super T> predicate);

        // boolean test(int value);
        IntPredicate intPredicate = EvenFilter::isEven;

        IntStream.rangeClosed(20, 30).filter(intPredicate).forEach(System.out::println);
    }
}

class EvenFilter {
    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}