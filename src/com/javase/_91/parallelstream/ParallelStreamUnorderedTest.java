package com.javase._86.parallelstream;

import java.util.Arrays;

public class ParallelStreamUnorderedTest {

    public static void main(String[] args) {

        Arrays.asList(1, 5, 20, 4, 3, 8, 100).stream().unordered().parallel().forEach(System.out::println);
        // For serial streams, using an unordered version has no effect, but on
        // parallel streams, the results can greatly improve performance:
        // you should know when to apply an unordered stream to improve
        // performance.
    }
}

// unordered;
// This method does not actually reorder the elements; it just tells the JVM
// that if an order-based stream operation is applied, the order can be ignored.