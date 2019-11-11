package com.javase._66.streamsources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSourcesTest02 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();
    }
}
