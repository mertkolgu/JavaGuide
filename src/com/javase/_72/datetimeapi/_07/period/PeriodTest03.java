package com.javase._67.datetimeapi._07.period;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodTest03 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        now = now.plusMonths(2);
        System.out.println(now);

        Period p1 = Period.ofMonths(2);
        now = now.plus(p1);

        System.out.println(now);

        LocalTime time = LocalTime.now();
        // time.plus(p1);
        // Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months
    }
}