package com.javase._39.dateandcalendar;

import java.text.DateFormat;
import java.util.Date;

public class NotesForDateFormat {

    public static void main(String[] args) {

        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();

        System.out.println(date);
        System.out.println(df1.format(date));

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df2.format(date));

        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df3.format(date));

        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df4.format(date));
    }
}

// java.text.DateFormat
// public abstract class DateFormat extends Format {
// public class SimpleDateFormat extends DateFormat {