package com.javase._68.streamterminal;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectTest01 {

    public static void main(String[] args) {
        // <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,
        // BiConsumer<R, R> combiner)
        // <R,A> R collect(Collector<? super T, A,R> collector)
        String frenchCounting = "un:deux:trois:quatre";
        List<String> gmailList = Pattern.compile(":").splitAsStream(frenchCounting).collect(Collectors.toList());

        System.out.println(gmailList);  // [un, deux, trois, quatre]
    }
}
