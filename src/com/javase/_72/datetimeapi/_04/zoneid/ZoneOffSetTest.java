package com.javase._67.datetimeapi._04.zoneid;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneOffSetTest {

    public static void main(String[] args) {

        ZoneId myZone = ZoneId.of("Asia/Kolkata");
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);

        ZonedDateTime zonedDateTime = dateTime.atZone(myZone);

        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println(zoneOffset);
    }
}