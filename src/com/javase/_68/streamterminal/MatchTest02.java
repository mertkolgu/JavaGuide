package com.javase._68.streamterminal;

import java.util.stream.IntStream;

public class MatchTest02 {

    public static void main(String[] args) {
        // Average temperatures in Concordia, Antarctica in a week in October 2015
        boolean anyMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
        System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);
        // hiçbiri eşleşmiyor anyMatch -> false olur.

        boolean allMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).allMatch(temp -> temp > 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);
        // hiçbiri eşleşmiyor allMatch -> false

        boolean noneMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
        System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);
        // hiçbiri eşleşmiyor bu nedenle nonMatch true!
    }
}
