package com.javase._86.parallelstream;

import java.util.Arrays;

public class ParallelStreamFindAnyTest {

    public static void main(String[] args) {

        Integer findAny1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().findAny().get();
        System.out.println(findAny1);

        // parallel streams, the results of findAny() are no longer predictable.
        Integer findAny2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallelStream().findAny().get();
        System.out.println(findAny2);
    }
}