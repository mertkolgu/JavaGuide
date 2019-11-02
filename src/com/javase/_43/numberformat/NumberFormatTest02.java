package com.javase._43.numberformat;

import java.text.NumberFormat;

public class NumberFormatTest02 {

    public static void main(String[] args) {
        // NumberFormat virgülden sonra 3 hane destekler.
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());  // 3
        System.out.println(nf.getMinimumFractionDigits());  // 0

        int number1 = 100;
        System.out.println(nf.format(number1)); // 100

        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(number1)); // 100.00

        double number2 = 234234.23432423;
        System.out.println(nf.format(number2)); // 234,234.234

        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(number2)); // 234,234.23432
    }
}
