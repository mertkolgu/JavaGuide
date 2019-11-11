package com.javase._72.datetimeapi._01.localdate;

import java.time.LocalDate;

public class LocalDateTest06 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2015-10-26");

        // String -> LocalDate
        // ISO 8601 formatına uygun olmalı.
        System.out.println(localDate);

        LocalDate localDate2 = LocalDate.parse("2015-02-30");
        System.out.println(localDate2);
        // Exception in thread "main" java.time.format.DateTimeParseException: Text
        // '2015-02-30' could not be parsed: Invalid date 'FEBRUARY 30'
    }
}
