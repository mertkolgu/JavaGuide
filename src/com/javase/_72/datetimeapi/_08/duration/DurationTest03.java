package com.javase._67.datetimeapi._08.duration;

import java.time.LocalDate;
import java.time.Period;

public class DurationTest03 {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2017, 6, 18);
        LocalDate now = LocalDate.now();

        // Duration d1 = Duration.between(startDate, now);
        // Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds

        // Duration -> H (hour) , Minutes , seconds
        // Period , gun/day , year

        Period p1 = Period.between(startDate, now);
        System.out.println(p1);
    }
}