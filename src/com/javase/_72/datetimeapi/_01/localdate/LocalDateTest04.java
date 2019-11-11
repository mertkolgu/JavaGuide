package com.javase._72.datetimeapi._01.localdate;

import java.time.LocalDate;

public class LocalDateTest04 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // LocalDate sınıfının objeleri IMMUTABLE'dir.
        // java.lang.String sınıfının objeleri de Immutabledir.
        String str = "java";
        str.concat(" cool");
        System.out.println(str);    // java

        now.plusDays(20); // DİKKAT
        System.out.println(now);    // 2019-11-11

        now = now.plusDays(20);
        System.out.println(now);    // 2019-12-01

        now = now.plusMonths(3).plusWeeks(6).plusYears(2);
        System.out.println(now);    // 2022-04-12
    }
}
