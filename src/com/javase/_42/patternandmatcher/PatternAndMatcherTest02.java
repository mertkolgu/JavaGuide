package com.javase._42.patternandmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherTest02 {

    public static void main(String[] args) {

//        String content = "content1 con2tent25k";
//        // Pattern p = Pattern.compile("\\d");     // \d -> [0-9]
//        // Pattern p = Pattern.compile("\\dt");    // \d -> [0-9]
//        Pattern p = Pattern.compile("\\d\\dk");    // \d -> [0-9]
//        Matcher m = p.matcher(content);
//
//        while (m.find()) {
//            System.out.println(m.start() + " " + m.group());
//        }

//        String content = "content1 con2tent25k";
//        Pattern p = Pattern.compile("\\s");
//        Matcher m = p.matcher(content);
//
//        while (m.find()) {
//            System.out.println(m.start() + " " + m.group());
//        }

//        String content = "content1 con2tent25k";
//        Pattern p = Pattern.compile("\\."); // \\. bu şekilde kullanmıyoruz bu nokta karakterinin kendisini temsil
//        Matcher m = p.matcher(content);
//
//        while (m.find()) {
//            System.out.println(m.start() + " " + m.group());
//        }

        String content = "content1 con2tent25k";
        Pattern p = Pattern.compile("c.n"); // tek başına kullandığımızda meta character olur. buraya herhangi bir karakter gelebilir.
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }
}

// \d digit
// \s whitespace
// \w harf, rakam
// \D non-digit
// \S non-whitespace
// \W non-word
// .