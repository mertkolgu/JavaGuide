package com.javase._67.datetimeapi._05.zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest01 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(localDateTime);
        System.out.println(zonedDateTime);

        // LocalDateTime = LocalDate + LocalTime
        // ZonedDateTime = LocalDateTime + ZoneId

        // 2019-02-04T22:20:31.589834
        // 2019-02-04T22:20:31.591273+03:00[Europe/Istanbul]
    }
}