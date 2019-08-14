package com.javase._39.dateandcalendar;

import java.util.Calendar;

public class NotesForCalendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        // magic number! bu tarz programlama YAPMA!
        System.out.println(calendar.get(1));

        // public static final int YEAR = 1; -> Doğru yaklaşım
        System.out.println(calendar.get(Calendar.YEAR));

        // Aylar sıfırdan başlar!!
        // Bu da eski date apide olan kötü bir özellik
        System.out.println(calendar.get(Calendar.MONTH));

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));

        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.YEAR, 2);
        calendar1.add(Calendar.MONTH, 6);
        System.out.println(calendar1);
    }
}

// java.util.Calendar abstract sınıftır.