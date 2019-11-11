package com.javase._68.streamterminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxTest01 {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("monkey", "ape", "bonobo");
        Stream<String> stream2 = Stream.of("monkey", "ape", "bonobo");

        // int compare(T o1, T o2);
        Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();

        Optional<String> min = stream1.min(comp);
        Optional<String> max = stream2.max(comp);

        System.out.println(min);    // Optional[ape]
        System.out.println(max);    // Optional[monkey]
    }
}

// Optional<T> min(<? super T> comparator)
// Optional<T> max(<? super T> comparator)
