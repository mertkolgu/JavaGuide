package com.javase._67.streamintermediate;

import java.util.stream.Stream;

public class IntermediatePeekTest01 {

    public static void main(String[] args) {
        // Stream<T> peek(Consumer<? super T> action);
        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i)).count();
        // Stream metotları lazy olarak çalışır.
        // yani eğer bir sonuç yoksa yani bir terminal metodu yoksa, stream ifadesi çalışmaz.

        // The peek() method is meant primarily for debugging purposes. It helps us
        // understand how the elements are transformed in the pipeline. Do not use it in
        // production code.
    }
}
