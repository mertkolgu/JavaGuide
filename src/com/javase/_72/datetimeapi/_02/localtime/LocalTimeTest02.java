package com.javase._72.datetimeapi._02.localtime;

import java.time.LocalTime;

public class LocalTimeTest02 {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        now = now.plusHours(4).plusMinutes(20).plusSeconds(50);
        System.out.println(now);    // 19:16:51.099707300
    }
}
