package com.javase._72.datetimeapi._04.zoneid;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTest01 {

    public static void main(String[] args) {
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println(defaultZone);    // Europe/Istanbul

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.forEach(System.out::println);
    }
}
