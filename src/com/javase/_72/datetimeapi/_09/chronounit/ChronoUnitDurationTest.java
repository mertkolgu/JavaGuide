package com.javase._67.datetimeapi._09.chronounit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDurationTest {

    public static void main(String[] args) {

        System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());
        // prints: 60
        System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds());
        // prints:3600
        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());
        // prints: 86400
    }
}