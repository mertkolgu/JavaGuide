package com.javase._69.streamprimitive;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;

public class StatisticsTest01 {

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
        // Number of words = 28
        // Sum of the length of the words = 115
        // Minimum word size = 1
        // Maximum word size 8
        // Average word size = 4.107143
    }
}
