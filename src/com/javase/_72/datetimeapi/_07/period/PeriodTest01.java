package com.javase._72.datetimeapi._07.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {

    public static void main(String[] args) {
        // The java.time.Period class is used to measure an amount of time in terms of
        // years, months, and days.
        LocalDate manufacturingDate = LocalDate.of(2016, Month.JANUARY, 1);
        LocalDate expiryDate = LocalDate.of(2018, Month.JULY, 18);
        Period expiry = Period.between(manufacturingDate, expiryDate);

        System.out.println(expiry);
        // P2Y6M17D
        // P -> Period
        // Y -> Year
        // M -> Month
        // D -> Day
    }
}
