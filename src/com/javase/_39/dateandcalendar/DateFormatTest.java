package com.javase._39.dateandcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) throws ParseException {

        DateFormat df = DateFormat.getDateInstance();
        Date date = new Date();

        System.out.println(df.format(date));

        String str = "Jul 24, 2019";
        System.out.println(df.parse(str));

        // parse String -> Date dönüşüm sağlar
        // checked exception throws ParseException
    }
}