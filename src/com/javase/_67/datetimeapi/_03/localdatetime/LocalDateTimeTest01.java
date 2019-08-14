package com.javase._67.datetimeapi._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // character T stands for time, and it separates the date and time components.
        // 2019-02-04T22:09:13.256528
    }
}

// The class java.time.LocalDateTime represents both date and time without time zones.
// The date and time formats use the ISO-8601 calendar system: YYYY-MM-DD HH:MM:SS.nanosecond.