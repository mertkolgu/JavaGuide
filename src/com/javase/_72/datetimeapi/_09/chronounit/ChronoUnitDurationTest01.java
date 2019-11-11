package com.javase._72.datetimeapi._09.chronounit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDurationTest01 {

    public static void main(String[] args) {
        System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());    // 60
        System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds());      // 3600
        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());       // 86400
    }
}
