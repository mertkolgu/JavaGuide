package com.javase._72.datetimeapi._01.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest07 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Month month = now.getMonth();
        System.out.println(month);  // NOVEMBER

        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth); // 11

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);  // MONDAY

        int dayOfYear = now.getDayOfYear();
        System.out.println(dayOfYear);  // 315

        int dayOfMonth2 = now.get(ChronoField.DAY_OF_MONTH);
        System.out.println(dayOfMonth2);    // 11
    }
}
