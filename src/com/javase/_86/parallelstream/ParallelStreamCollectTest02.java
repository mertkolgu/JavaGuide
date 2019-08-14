package com.javase._86.parallelstream;

import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

public class ParallelStreamCollectTest02 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(set);    // [f, l, o, w]
    }
}

// ConcurrentSkipListSet are sorted according to their natural ordering.