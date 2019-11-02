package com.javase._67.datetimeapi._09.chronounit;

import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {

    // The TemporalUnit interface is part of the java.time.temporal package. It
    // represents date or time units such as seconds, hours, days, months, years,
    // and so on. The enumeration java.time.temporal.ChronoUnit implements this
    // interface.

    // public interface TemporalUnit {
    // public enum ChronoUnit implements TemporalUnit {

    public static void main(String[] args) {

        System.out.println("ChronoUnit DateBased TimeBased Duration");
        System.out.println("---------------------------------------");
        for (ChronoUnit unit : ChronoUnit.values()) {
            System.out.printf("%10s \t %b \t\t %b \t\t %s %n",
                    unit, unit.isDateBased(), unit.isTimeBased(), unit.getDuration());
        }
    }
}