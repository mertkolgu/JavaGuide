package com.javase._72.datetimeapi._10.format;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest02 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(dtf.format(localDate));  // 11/11/2019

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf2.format(LocalTime.now()));   // 15:52
    }
}
