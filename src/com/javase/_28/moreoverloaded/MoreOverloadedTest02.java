package com.javase._28.moreoverloaded;

public class MoreOverloadedTest02 {

    public static void main(String[] args) {
        Short s = 10;
        overloaded(s);
    }

    // Short IS-A Number
    public static void overloaded(short s) {
        System.out.println("short");
    }

    public static void overloaded(Object n) {
        System.out.println("Number");
    }
}
