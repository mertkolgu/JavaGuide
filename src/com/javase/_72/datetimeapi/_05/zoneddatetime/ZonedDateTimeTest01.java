package com.javase._72.datetimeapi._05.zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest01 {

    public static void main(String[] args) {
        // LocalDateTime = LocalDate + LocalTime
        // ZonedDateTime = LocalDateTime + ZoneId
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);  // 2019-11-11T15:38:20.440253800

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);  // 2019-11-11T15:38:20.441253600+03:00[Europe/Istanbul]
    }
}
