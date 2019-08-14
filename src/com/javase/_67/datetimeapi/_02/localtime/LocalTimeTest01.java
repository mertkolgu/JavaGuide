package com.javase._67.datetimeapi._02.localtime;

import java.time.LocalTime;

public class LocalTimeTest01 {

    public static void main(String[] args) {

        LocalTime currTime = LocalTime.now();

        System.out.println(currTime);
        // HH:MM:SS.nanosecond.

        LocalTime time1 = LocalTime.of(20, 10);
        LocalTime time2 = LocalTime.of(20, 10, 40);

        System.out.println(time1);
        System.out.println(time2);
    }
}