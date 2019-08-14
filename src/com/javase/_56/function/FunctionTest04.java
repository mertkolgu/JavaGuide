package com.javase._56.function;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest04 {

    public static void main(String[] args) {

        Function<String, Integer> f1 = Integer::parseInt;
        Function<Integer, Integer> f2 = Math::abs;
        Function<Integer, Integer> f2_V2 = e -> Math.abs(e);
        Function<String, Integer> f3 = f1.andThen(f2);
        Function<String, Integer> f4 = f2.compose(f1);

        // compose ile andThen in calisma sirasi farklidir.

        // What is the difference between andThen() and compose() methods in Function
        // interface? The andThen() method applies the passed argument after calling the
        // current Function (as in this example). The compose() method calls the
        // argument before calling the current Function, as in

        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        Stream.of("-10", "2", "5", "100", "-1", "-3").map(f1).forEach(x -> System.out.println(x * 2));

        System.out.println();
        Stream.of("-10", "2", "5", "100", "-1", "-3").map(f1).map(f2).forEach(x -> System.out.println(x * 2));

        System.out.println();
        Stream.of("-10", "2", "5", "100", "-1", "-3").map(f3).forEach(x -> System.out.println(x * 2));
    }
}