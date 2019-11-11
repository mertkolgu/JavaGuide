package com.javase._72.datetimeapi._02.localtime;

import java.time.LocalTime;

public class LocalTimeTest01 {

    public static void main(String[] args) {
        LocalTime currTime = LocalTime.now();
        System.out.println(currTime);   // 14:55:24.833032100
        // HH:MM:SS.nanosecond.

        LocalTime time1 = LocalTime.of(20, 10);
        System.out.println(time1);  // 20:10

        LocalTime time2 = LocalTime.of(20, 10, 40);
        System.out.println(time2);  // 20:10:40
    }
}
