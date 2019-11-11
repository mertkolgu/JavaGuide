package com.javase._72.datetimeapi._02.localtime;

import java.time.LocalTime;

public class LocalTimeTest03 {

    public static void main(String[] args) {
        LocalTime parsedTime = LocalTime.parse("18:30:05");
        System.out.println(parsedTime); // 18:30:05
    }
}
