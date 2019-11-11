package com.javase._72.datetimeapi._05.zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest02 {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Rome");

        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        System.out.println(localDateTime);  // 2019-11-11T13:38:58.311822600

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);  // 2019-11-11T13:38:58.311822600+01:00[Europe/Rome]

        ZoneId zoneId2 = ZoneId.of("US/Pacific-New");
        System.out.println(zoneId2);    // US/Pacific-New

        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zoneId2);
        System.out.println(zonedDateTime2); // 2019-11-11T04:38:58.313817100-08:00[US/Pacific-New]
    }
}
