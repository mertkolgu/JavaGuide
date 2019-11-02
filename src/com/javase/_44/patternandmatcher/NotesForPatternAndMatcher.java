package com.javase._44.patternandmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotesForPatternAndMatcher {

    public static void main(String[] args) {
        String content = "java";
        Pattern p = Pattern.compile("v");
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());    // 2 v
        }

        String content1 = "injavawetrust";
        Pattern p1 = Pattern.compile("t");
        Matcher m1 = p1.matcher(content1);

        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
            // 8 t
            // 12 t
        }

        String content2 = "injavawetrust";
        Pattern p2 = Pattern.compile("vaw");
        Matcher m2 = p2.matcher(content2);

        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group());  // 4 vaw
        }

        String content3 = "injavawetrust";
        Pattern p3 = Pattern.compile("ja|e|u");  // | -> or/veya
        Matcher m3 = p3.matcher(content3);

        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group());
            // 2 ja
            // 7 e
            // 10 u
        }

        String content4 = "injavawetrust";
        Pattern p4 = Pattern.compile("[jwt]");   // j|w|t
        Matcher m4 = p4.matcher(content4);

        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group());
            // 2 j
            // 6 w
            // 8 t
            // 12 t
        }

        String content5 = "injavawetrust";
        Pattern p5 = Pattern.compile("[jwt][er]");   // [j|w|t][e|r]
        Matcher m5 = p5.matcher(content5);

        while (m5.find()) {
            System.out.println(m5.start() + " " + m5.group());
            // 6 we
            // 8 tr
        }

        String content6 = "injavawetrust";
        Pattern p6 = Pattern.compile("[a-e]");   // a|b|c|d|e
        Matcher m6 = p6.matcher(content6);

        while (m6.find()) {
            System.out.println(m6.start() + " " + m6.group());
            // 3 a
            // 5 a
            // 7 e
        }

        String content7 = "71426";
        Pattern p7 = Pattern.compile("[2-6]");  // 2|3|4|5|6
        Matcher m7 = p7.matcher(content7);

        while (m7.find()) {
            System.out.println(m7.start() + " " + m7.group());
            // 2 4
            // 3 2
            // 4 6
        }

        String content8 = "injavawetrust";
        Pattern p8 = Pattern.compile("[^ajt]s");   // carat işareti; bunların dışında anlamına gelir.
        Matcher m8 = p8.matcher(content8);

        while (m8.find()) {
            System.out.println(m8.start() + " " + m8.group());    // 10 us
        }
    }
}

// regex -> regular expression

// java.util.regex.Matcher
// java.util.regex.Pattern
