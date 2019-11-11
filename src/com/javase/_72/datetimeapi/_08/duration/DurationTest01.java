package com.javase._72.datetimeapi._08.duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest01 {

    // We discussed the Period class earlier—it represents time in terms of years,
    // months, and days. Duration is the time equivalent of Period. The Duration
    // class represents time in terms of hours, minutes, seconds, and so on
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(15, 20, 50);
        LocalTime now = LocalTime.now();

        Duration d1 = Duration.between(time1, now);
        System.out.println(d1); // PT25M38.7602025S

        Duration d2 = Duration.between(now, time1);
        System.out.println(d2); // PT-25M-38.7602025S

        // PT25M38.7602025S
        // H -> Hour
        // M -> Minute
        // S -> Second
    }
}
