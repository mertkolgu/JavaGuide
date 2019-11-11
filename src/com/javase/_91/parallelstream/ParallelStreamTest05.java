package com.javase._91.parallelstream;

import java.util.Arrays;

public class ParallelStreamTest05 {

    public static void main(String[] args) {
        Arrays.asList("jackal", "kangaroo", "lemur").parallelStream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println);
        // kangaroo
        // KANGAROO
        // jackal
        // JACKAL
        // lemur
        // LEMUR
    }
}

// For the exam, you should remember that parallel streams can process results
// independently, although the order of the results cannot be determined ahead
// of time.
