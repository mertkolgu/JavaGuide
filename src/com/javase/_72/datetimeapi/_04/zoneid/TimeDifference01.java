package com.javase._72.datetimeapi._04.zoneid;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDifference01 {

    public static void main(String[] args) {
        ZoneId singaporeZone = ZoneId.of("Asia/Singapore");
        ZonedDateTime dateTimeInSingapore = ZonedDateTime.of(LocalDateTime.of(2016, Month.JANUARY, 1, 6, 0),
                singaporeZone);
        System.out.println(dateTimeInSingapore);    // 2016-01-01T06:00+08:00[Asia/Singapore]

        ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
        ZonedDateTime sameDateTimeInAuckland = dateTimeInSingapore.withZoneSameInstant(aucklandZone);
        System.out.println(sameDateTimeInAuckland); // 2016-01-01T11:00+13:00[Pacific/Auckland]

        Duration timeDifference = Duration.between(dateTimeInSingapore.toLocalTime(),
                sameDateTimeInAuckland.toLocalTime());
        System.out.printf("Time difference between %s and %s zones is %d hours", singaporeZone, aucklandZone,
                timeDifference.toHours());  // Time difference between Asia/Singapore and Pacific/Auckland zones is 5 hours
    }
}
