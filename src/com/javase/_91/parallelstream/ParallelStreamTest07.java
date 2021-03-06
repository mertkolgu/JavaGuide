package com.javase._91.parallelstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamTest07 {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).parallelStream().map(i -> {
            data.add(i);    // AVOID STATEFUL LAMBDA EXPRESSIONS!
            return i;
        }).forEachOrdered(i -> System.out.print(i + " "));  // 1 2 3 4 5 6 7 8

        // Anytime you are working with a collection with a parallel stream, it
        // is recommended that you use a concurrent collection.

        System.out.println();
        System.out.println(data);   // [1, 8, 4, 5, 2, 3] -> missing !

        // For an ArrayList object, the JVM internally manages a primitive array
        // of the same type. As the size of the dynamic ArrayList grows, a new,
        // larger primitive array is periodically required. If two threads both
        // trigger the array to be resized at the same time, a result can be
        // lost, producing the unexpected value shown here.
    }
}
