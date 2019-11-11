package com.javase._68.streamterminal;

import java.util.Arrays;
import java.util.Comparator;

public class MinMaxTest02 {

    public static void main(String[] args) {
        String[] string = "you never know what you have until you clean your room".split(" ");
        String[] string2 = "you never know what you have until you clean your room".split(" ");
        String[] string3 = "you never know what you have until you clean your room".split(" ");

        System.out.println(Arrays.stream(string).min(String::compareTo).get()); // clean
        System.out.println(Arrays.stream(string2).max(String::compareTo).get());    // your

        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        System.out.println(Arrays.stream(string3).min(lengthCompare).get());    // you
    }
}
