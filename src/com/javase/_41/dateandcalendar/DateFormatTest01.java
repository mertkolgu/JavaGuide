package com.javase._41.dateandcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatTest01 {

    public static void main(String[] args) throws ParseException {
        DateFormat df = DateFormat.getDateInstance();
        Date date = new Date();
        System.out.println(df.format(date));    // Oct 30, 2019

        String str = "Jul 24, 2019";
        System.out.println(df.parse(str));  // Wed Jul 24 00:00:00 EET 2019
        // parse, String -> Date dönüşüm sağlar
        // checked exception throws ParseException
    }
}
