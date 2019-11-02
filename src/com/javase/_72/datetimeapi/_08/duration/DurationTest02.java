package com.javase._67.datetimeapi._08.duration;

import java.time.Duration;
import java.time.Period;

public class DurationTest02 {

    public static void main(String[] args) {

        Duration d1 = Duration.ofDays(1);
        System.out.println(d1); // PT24H

        Period p1 = Period.ofDays(1);
        System.out.println(p1); // P1D

        System.out.println(Duration.ofHours(20));
        System.out.println(Duration.ofMinutes(80)); // PT1H20M
    }
}