package com.javase._42.patternandmatcher;

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

//        String content = "cont566ent1 ctn2tent25k.";
//        Pattern p = Pattern.compile("\\d");
//        Matcher m = p.matcher(content);
//
//        while (m.find()) {
//            System.out.println("index : " + m.start() + "  the number : " + m.group());
//        }

//        String content = "cont566ent1 ctn2tent25k.";
//        Pattern p = Pattern.compile("\\d+");
//        Matcher m = p.matcher(content);
//
//        while (m.find()) {
//            System.out.println("index : " + m.start() + "  the number : " + m.group());
//        }

//        String content = "cont566ent15a ct889n2t9876ent25k.";
//        Pattern p = Pattern.compile("\\d{3}"); // \\d\\d\\d
//        Matcher m = p.matcher(content);
//
//        while (m.find()) {
//            System.out.println("index : " + m.start() + "  the number : " + m.group());
//        }

        String content = "cont566ent15a ct889n2t9876ent25k.";
        Pattern p = Pattern.compile("\\d{3,}"); //virgul ekledimizde 3 ya da daha fazla...
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println("index : " + m.start() + "  the number : " + m.group());
        }
    }
}