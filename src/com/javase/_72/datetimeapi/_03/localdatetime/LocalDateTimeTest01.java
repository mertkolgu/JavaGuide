package com.javase._72.datetimeapi._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {

    // The class java.time.LocalDateTime represents both date and time without time zones.
    // The date and time formats use the ISO-8601 calendar system: YYYY-MM-DD HH:MM:SS.nanosecond.
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);    // 2019-11-11T15:29:47.171040100
        // character T stands for time, and it separates the date and time components.
        // 2019-02-04T22:09:13.256528
    }
}
