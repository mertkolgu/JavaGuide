package com.javase._67.datetimeapi._01.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest07 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int dayOfYear = now.getDayOfYear();
        int dayOfMonth2 = now.get(ChronoField.DAY_OF_MONTH);

        System.out.println(month);
        System.out.println(dayOfMonth);
        System.out.println(dayOfMonth2);
        System.out.println(dayOfWeek);
        System.out.println(dayOfYear);
    }
}