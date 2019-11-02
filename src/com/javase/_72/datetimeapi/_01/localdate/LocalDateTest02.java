package com.javase._67.datetimeapi._01.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest02 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020, 5, 5);
        System.out.println(localDate);

        LocalDate localDate2 = LocalDate.of(2020, Month.MAY, 5);
        System.out.println(localDate2);
    }
}