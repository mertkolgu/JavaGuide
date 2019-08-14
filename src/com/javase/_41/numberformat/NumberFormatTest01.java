package com.javase._41.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {

    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        double number = 12322.224233;
        System.out.println(nf.format(number));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(nf2.format(number));

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(nf3.format(number));

        NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("tr", "TR"));
        System.out.println(nf4.format(number));

        NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(nf5.format(number));
    }
}