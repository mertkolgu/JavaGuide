package com.javase._67.datetimeapi._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest03 {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Today's date and current time: " + dateTime);
        System.out.println("The date component is: " + dateTime.toLocalDate());
        System.out.println("The time component is: " + dateTime.toLocalTime());
    }
}