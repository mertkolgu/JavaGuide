package com.javase._72.datetimeapi._04.zoneid;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneOffSetTest01 {

    public static void main(String[] args) {
        ZoneId myZone = ZoneId.of("Asia/Kolkata");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);   // 2019-11-11T15:35:54.453737200

        ZonedDateTime zonedDateTime = dateTime.atZone(myZone);
        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println(zoneOffset); // +05:30
    }
}
