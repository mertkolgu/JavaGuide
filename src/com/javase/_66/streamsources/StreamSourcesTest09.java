package com.javase._61.streamsources;

import java.util.Random;

public class StreamSourcesTest09 {

    public static void main(String[] args) {

        // eğer limit belirlemezsek sonsuz tane sayı üretmeye çalışır!
        // public IntStream ints() {
        // new Random().ints().forEach(System.out::println);
        new Random().ints().limit(5).forEach(System.out::println);
    }
}