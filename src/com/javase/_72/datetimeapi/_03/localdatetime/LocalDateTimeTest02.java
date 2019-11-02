package com.javase._67.datetimeapi._03.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest02 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime2 = LocalDateTime.of(2012, Month.APRIL, 18, 22, 12);
        System.out.println(localDateTime2);
    }
}