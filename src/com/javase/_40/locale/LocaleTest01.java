package com.javase._40.locale;

import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale); // en_TR

        Locale locale1 = new Locale("tr", "TR");
        System.out.println(locale1.getCountry());
        System.out.println(locale1.getDisplayCountry());
        System.out.println(locale1.getLanguage());
        System.out.println(locale1.getDisplayLanguage());
    }
}