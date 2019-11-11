package com.javase._72.datetimeapi._01.localdate;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateTest01 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);  // 2019-11-11

        Date date = new Date();
        System.out.println(date);   // Mon Nov 11 14:38:47 EET 2019
    }
}

// java.time.LocalDate represents a date without time or time zone. LocalDate is
// represented in the ISO-8601 calendar system in a year-month-day format
// (YYYY-MM-DD): for example, 2015-10-26.

// The Java 8 date and time API uses ISO 8601 as the default calendar format.
