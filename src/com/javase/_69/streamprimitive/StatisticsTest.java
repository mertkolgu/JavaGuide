package com.javase._64.streamprimitive;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;

public class StatisticsTest {

    public static void main(String[] args) {

        String limerick = "There was a young lady named Bright who traveled much faster than light She set out one day "
                + "in a relative way and came back the previous night ";

        IntSummaryStatistics wordStatistics = Pattern.compile(" ").splitAsStream(limerick)
                .mapToInt(word -> word.length()).summaryStatistics();

        // IntSummaryStatistics summaryStatistics();
        // LongSummaryStatistics summaryStatistics();
        // DoubleSummaryStatistics summaryStatistics();

        System.out.printf(
                "Number of words = %d \nSum of the length of the words = %d \n"
                        + "Minimum word size = %d \nMaximum word size %d \n" + "Average word size = %f \n",
                wordStatistics.getCount(), wordStatistics.getSum(), wordStatistics.getMin(), wordStatistics.getMax(),
                wordStatistics.getAverage());
    }
}