package com.javase._66.streamsources;

public class StreamSourcesTest10 {

    public static void main(String[] args) {
        // public IntStream chars() {
        "hello".chars().sorted().forEach(ch -> System.out.printf("%c ", ch));
    }
}
