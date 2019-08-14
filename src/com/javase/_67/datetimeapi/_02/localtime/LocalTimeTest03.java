package com.javase._67.datetimeapi._02.localtime;

import java.time.LocalTime;

public class LocalTimeTest03 {

    public static void main(String[] args) {

        LocalTime parsedTime = LocalTime.parse("18:30:05");
        System.out.println(parsedTime);
    }
}