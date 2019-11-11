package com.javase._72.datetimeapi._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest03 {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Today's date and current time: " + dateTime);   // 2019-11-11T15:30:30.084291
        System.out.println("The date component is: " + dateTime.toLocalDate()); // 2019-11-11
        System.out.println("The time component is: " + dateTime.toLocalTime()); // 15:30:30.084291
    }
}
