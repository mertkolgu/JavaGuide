package com.javase._67.datetimeapi._04.zoneid;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTest {

    public static void main(String[] args) {

        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println(defaultZone);
        // Europe/Istanbul

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        zoneIds.forEach(System.out::println);
    }
}