package com.javase._72.datetimeapi._07.period;

import java.time.Period;

public class PeriodTest02 {

    public static void main(String[] args) {
        Period p1 = Period.ofYears(2);
        System.out.println(p1); // P2Y

        Period p2 = Period.ofMonths(10);
        System.out.println(p2); // P10M

        Period p3 = Period.ofWeeks(5);
        System.out.println(p3); // P35D

        Period p4 = Period.ofDays(30);
        System.out.println(p4); // P30D
    }
}
