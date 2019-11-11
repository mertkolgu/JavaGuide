package com.javase._91.parallelstream;

import java.util.Arrays;

public class ParallelStreamTest03 {

    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5, 6, 7).stream().forEach(s -> System.out.print(s + " "));
        System.out.println();   // 1 2 3 4 5 6 7

        // the results are no longer ordered or predictable.
        Arrays.asList(1, 2, 3, 4, 5, 6, 7).parallelStream().forEach(s -> System.out.print(s + " "));
        System.out.println();   // 5 4 7 1 6 3 2

        Arrays.asList(1, 2, 3, 4, 5, 6, 7).parallelStream().forEachOrdered(s -> System.out.print(s + " ")); // 1 2 3 4 5 6 7
    }
}
