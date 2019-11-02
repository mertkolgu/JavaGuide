package com.javase._67.datetimeapi._10.format;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {

    public static void main(String[] args) {

        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(customFormat.format(LocalDate.of(2016, Month.JANUARY, 01)));
    }
}