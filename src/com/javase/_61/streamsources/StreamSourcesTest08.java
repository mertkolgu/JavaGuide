package com.javase._61.streamsources;

import java.util.regex.Pattern;

public class StreamSourcesTest08 {

    public static void main(String[] args) {

        // public Stream<String> splitAsStream(final CharSequence input) {
        Pattern.compile(" ").splitAsStream("java 8 streams").forEach(System.out::println);
    }
}