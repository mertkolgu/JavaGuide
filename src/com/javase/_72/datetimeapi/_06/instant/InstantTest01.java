package com.javase._72.datetimeapi._06.instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);    // 2019-11-11T12:40:34.840262Z

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);  // 2019-11-11T15:40:34.853226600

        // Suppose you want to trace the execution of a Java application or store the
        // application events in a file. For these purposes, you need to get timestamp
        // values, and you can do so using the java.time.Instant class. The instant
        // values began on January 1, 1970, at 00:00:00 hours (known as the Unix epoch).
    }
}
