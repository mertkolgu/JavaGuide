package com.javase._67.datetimeapi._01.localdate;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTest08 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDate);
    }
}