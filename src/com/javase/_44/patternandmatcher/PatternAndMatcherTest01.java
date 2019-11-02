package com.javase._44.patternandmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherTest01 {

    public static void main(String[] args) {
        String content = "abababa";
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
            // 0 ab
            // 2 ab
            // 4 ab
        }

        String content1 = "abababa";
        Pattern p1 = Pattern.compile("aba");
        Matcher m1 = p1.matcher(content1);

        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
            // 0 aba
            // 4 aba
        }
        // regex işlemi soldan sağa doğru olur.
        // kullanılan index tekrar kullanılmıyor.
    }
}
