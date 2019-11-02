package com.javase._48.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest01 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 2, 100, -10, -20, 1, 7);
        Collections.sort(numbers);
        System.out.println(numbers);    // [-20, -10, 1, 2, 5, 7, 10, 100]
    }
}
