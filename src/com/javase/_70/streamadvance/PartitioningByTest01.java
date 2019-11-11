package com.javase._70.streamadvance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningByTest01 {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

        Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map);    // {false=[tigers], true=[lions, bears]}

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map2 = ohMy2.collect(Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map2);   // {false=[], true=[lions, tigers, bears]}
    }
}
