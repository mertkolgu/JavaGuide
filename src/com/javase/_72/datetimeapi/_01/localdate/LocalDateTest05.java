package com.javase._72.datetimeapi._01.localdate;

import java.time.LocalDate;

public class LocalDateTest05 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.minusDays(10);
        System.out.println(now);    // 2019-11-01
    }
}
