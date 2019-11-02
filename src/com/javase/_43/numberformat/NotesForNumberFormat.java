package com.javase._43.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NotesForNumberFormat {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        double number = 23346.35487;

        System.out.println(number); // 23346.35487
        System.out.println(nf.format(number));  // 23,346.355

        NumberFormat nf2 = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(nf2.format(number)); // 23.346,355

        NumberFormat nf3 = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(nf3.format(number)); // 23.346,355
    }
}

// java.text.NumberFormat
// public abstract class NumberFormat extends Format {}
