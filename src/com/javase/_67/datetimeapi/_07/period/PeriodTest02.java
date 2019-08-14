package com.javase._67.datetimeapi._07.period;

import java.time.Period;

public class PeriodTest02 {

    public static void main(String[] args) {

        Period p1 = Period.ofYears(2);
        Period p2 = Period.ofMonths(10);
        Period p3 = Period.ofWeeks(5);
        Period p4 = Period.ofDays(30);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}