package com.javase._67.datetimeapi._05.zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest02 {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Europe/Rome");

        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);

        ZoneId zoneId2 = ZoneId.of("US/Pacific-New");
        System.out.println(zoneId2);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zoneId2);
        System.out.println(zonedDateTime2);
    }
}