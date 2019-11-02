package com.javase._67.datetimeapi._02.localtime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest04 {

    public static void main(String[] args) {

        LocalTime tokyoTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoTime);
    }
}