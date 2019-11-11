package com.javase._72.datetimeapi._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest05 {

    public static void main(String[] args) {
        LocalDateTime parsed = LocalDateTime.parse("2019-02-04T22:13:25.355413");
        System.out.println(parsed); // 2019-02-04T22:13:25.355413
    }
}
