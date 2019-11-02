package com.javase._41.dateandcalendar;

import java.util.Date;

public class NotesForDate {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);   // Wed Oct 30 14:29:49 EET 2019

        // January 1, 1970, 00:00:00 GMT tarihinden bugüne geçen milisecond
        Long time = date.getTime();
        System.out.println(time);   // 1572434989413
    }
}

// java.util.Date
// java.util.Calendar

// Artık yeni LocalDate, Java Time/Date API kullanılması önerilmektedir.
