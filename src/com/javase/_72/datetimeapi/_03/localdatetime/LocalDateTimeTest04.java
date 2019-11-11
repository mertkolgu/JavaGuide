package com.javase._72.datetimeapi._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest04 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getDayOfYear()); // 315
        System.out.println(now.getDayOfMonth());    // 11
        System.out.println(now.getHour());  // 15
    }
}
