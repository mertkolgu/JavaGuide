package com.javase._44.patternandmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherTest02 {

    public static void main(String[] args) {
        String content = "content1 con2tent25k";
        Pattern p = Pattern.compile("\\d");     // \d -> [0-9]
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
            // 7 1
            // 12 2
            // 17 2
            // 18 5
        }

        String content1 = "content1 con2tent25k";
        Pattern p1 = Pattern.compile("\\dt");    // \d -> [0-9]
        Matcher m1 = p1.matcher(content1);

        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());  // 12 2t
        }

        String content2 = "content1 con2tent25k";
        Pattern p2 = Pattern.compile("\\d\\dk");    // \d -> [0-9]
        Matcher m2 = p2.matcher(content2);

        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group());  // 17 25k
        }

        String content3 = "content1 con2tent25k";
        Pattern p3 = Pattern.compile("\\s");
        Matcher m3 = p3.matcher(content3);

        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group());  // 8
        }

        String content4 = "content1 con2tent25k";
        Pattern p4 = Pattern.compile("\\."); // \\. bu şekilde kullanmıyoruz bu nokta karakterinin kendisini temsil
        Matcher m4 = p4.matcher(content4);

        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group());
        }

        String content5 = "content1 con2tent25k";
        Pattern p5 = Pattern.compile("c.n"); // tek başına kullandığımızda meta character olur. buraya herhangi bir karakter gelebilir.
        Matcher m5 = p5.matcher(content5);

        while (m5.find()) {
            System.out.println(m5.start() + " " + m5.group());
            // 0 con
            // 9 con
        }
    }
}

// Meta Characters
// \d digit
// \s whitespace
// \w harf, rakam
// \D non-digit
// \S non-whitespace
// \W non-word
// .
