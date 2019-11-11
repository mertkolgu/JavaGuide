package com.javase._72.datetimeapi._01.localdate;

import java.time.LocalDate;

public class LocalDateTest03 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.ofYearDay(2016, 60);
        System.out.println(localDate);  // 2016-02-29

        LocalDate localDate2 = LocalDate.ofEpochDay(2000);  // 1970 1 January 00.00.00.0000
        System.out.println(localDate2); // 1975-06-24
    }
}
