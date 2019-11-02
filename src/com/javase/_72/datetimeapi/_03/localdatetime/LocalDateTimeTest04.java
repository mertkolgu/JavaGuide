package com.javase._67.datetimeapi._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest04 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
    }
}