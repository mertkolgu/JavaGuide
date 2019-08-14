package com.javase._67.datetimeapi._06.instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(instant);
        System.out.println(localDateTime);

        // Suppose you want to trace the execution of a Java application or store the
        // application events in a file. For these purposes, you need to get timestamp
        // values, and you can do so using the java.time.Instant class. The instant
        // values began on January 1, 1970, at 00:00:00 hours (known as the Unix epoch).
    }
}