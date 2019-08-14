package com.javase._67.datetimeapi._08.duration;

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
        Duration d2 = Duration.between(now, time1);

        System.out.println(d1);
        System.out.println(d2);

        // PT7H32M33.360286S
        // H -> Hour
        // M -> Minute
        // S -> Second
    }
}