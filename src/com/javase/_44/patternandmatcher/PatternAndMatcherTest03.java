package com.javase._44.patternandmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherTest03 {

    public static void main(String[] args) {
        // quantifier -> kaç defa geçiyor bilgisi için kullanılır.
        // * -> 0 veya daha fazla {0,}
        // + -> 1 veya daha fazla {1,}
        // ? -> 0 veya 1 tane {0,1}
        // {X} -> X tane kadar
        // {X,} ->X tane kadar ya da daha fazla
        // {X,Y} -> min X , max Y kadar tane olsun.

        String content = "cont566ent1 ctn2tent25k.";
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println("index : " + m.start() + "  the number : " + m.group());
            // index : 4  the number : 5
            // index : 5  the number : 6
            // index : 6  the number : 6
            // index : 10  the number : 1
            // index : 15  the number : 2
            // index : 20  the number : 2
            // index : 21  the number : 5
        }

        String content1 = "cont566ent1 ctn2tent25k.";
        Pattern p1 = Pattern.compile("\\d+");
        Matcher m1 = p1.matcher(content1);

        while (m1.find()) {
            System.out.println("index : " + m1.start() + "  the number : " + m1.group());
            // index : 4  the number : 566
            // index : 10  the number : 1
            // index : 15  the number : 2
            // index : 20  the number : 25
        }

        String content2 = "cont566ent15a ct889n2t9876ent25k.";
        Pattern p2 = Pattern.compile("\\d{3}"); // \\d\\d\\d
        Matcher m2 = p2.matcher(content2);

        while (m2.find()) {
            System.out.println("index : " + m2.start() + "  the number : " + m2.group());
            // index : 4  the number : 566
            // index : 16  the number : 889
            // index : 22  the number : 987
        }

        String content3 = "cont566ent15a ct889n2t9876ent25k.";
        Pattern p3 = Pattern.compile("\\d{3,}");    // virgül eklediğimizde 3 ya da daha fazla...
        Matcher m3 = p3.matcher(content3);

        while (m3.find()) {
            System.out.println("index : " + m3.start() + "  the number : " + m3.group());
            // index : 4  the number : 566
            // index : 16  the number : 889
            // index : 22  the number : 9876
        }
    }
}
