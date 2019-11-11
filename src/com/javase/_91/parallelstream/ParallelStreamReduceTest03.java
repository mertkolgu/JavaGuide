package com.javase._91.parallelstream;

import java.util.Arrays;

public class ParallelStreamReduceTest03 {

    public static void main(String[] args) {
        System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce("X", String::concat));
        // XwXoXlXf
    }
}
