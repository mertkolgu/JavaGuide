package com.javase._41.dateandcalendar;

import java.text.DateFormat;
import java.util.Date;

public class NotesForDateFormat {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();

        System.out.println(date);   // Tue Oct 29 22:29:57 EET 2019
        System.out.println(df1.format(date));   // Oct 29, 2019

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df2.format(date));   // October 29, 2019

        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df3.format(date));   // Oct 29, 2019

        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df4.format(date));   // Tuesday, October 29, 2019
    }
}

// java.text.DateFormat
// public abstract class DateFormat extends Format {}
// public class SimpleDateFormat extends DateFormat {}
