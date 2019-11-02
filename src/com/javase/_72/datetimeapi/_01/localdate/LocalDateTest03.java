package com.javase._67.datetimeapi._01.localdate;

import java.time.LocalDate;

public class LocalDateTest03 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.ofYearDay(2016, 60);
        System.out.println(localDate);

        LocalDate localDate2 = LocalDate.ofEpochDay(2000);  // 1970 1 January 00.00.00.0000
        System.out.println(localDate2);
    }
}