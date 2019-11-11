package com.javase._72.datetimeapi._02.localtime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest04 {

    public static void main(String[] args) {
        LocalTime tokyoTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoTime);  // 20:57:18.712418900
    }
}
