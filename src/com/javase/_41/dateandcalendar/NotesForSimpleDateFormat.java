package com.javase._41.dateandcalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NotesForSimpleDateFormat {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();

        System.out.println(sdf.format(date));   // 10/29/19, 10:31 PM

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sdf2.format(date));  // 29-10-2019

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(sdf3.format(date));  // 29/10/2019 22:31

        SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        System.out.println(sdf4.format(date));  // 29/10/2019 22:31:46.681

        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy E HH:mm:ss.SSS a Z");
        System.out.println(sdf5.format(date));  // 29/10/2019 Tue 22:31:46.681 PM +0300

        SimpleDateFormat sdf6 = new SimpleDateFormat("h:mm a");
        System.out.println(sdf6.format(date));  // 2:43 PM

        // büyük küçük harf FARKI VAR!!!! DİKKAT
        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    }
}
