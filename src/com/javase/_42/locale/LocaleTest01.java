package com.javase._42.locale;

import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale); // en_US

        Locale locale1 = new Locale("tr", "TR");
        System.out.println(locale1.getCountry());   // TR
        System.out.println(locale1.getDisplayCountry());    // Turkey
        System.out.println(locale1.getLanguage());  // tr
        System.out.println(locale1.getDisplayLanguage());   // Turkish
    }
}
