package com.javase._39.dateandcalendar;

import java.util.Date;

public class NotesForDate {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        // January 1, 1970, 00:00:00 GMT
        // tarihinden bugüne geçen milisecond
        Long time = date.getTime();
        System.out.println(time);
    }
}

// java.util.Date
// java.util.Calendar

// Artık yeni LocalDate, Java Time/Date API kullanılması önerilmektedir.