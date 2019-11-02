package com.javase._42.locale;

import java.util.Locale;

public class NotesForLocale {

    public static void main(String[] args) {
        Locale[] allLocals = Locale.getAvailableLocales();

        int count = 1;
        for (Locale loc : allLocals) {
            System.out.println(count + " , " + loc);
            count++;
        }
        // standart
        // language_CountryCode
        // language -> küçük harf
        // Country -> büyük harf
    }
}

// java.util.Locale
