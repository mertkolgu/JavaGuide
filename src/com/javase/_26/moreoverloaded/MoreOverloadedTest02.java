package com.javase._26.moreoverloaded;

public class MoreOverloadedTest02 {

    public static void main(String[] args) {

        Short s = 10;
        overloaded(s);
    }

    //
    public static void overloaded(short s) {
        System.out.println("short");
    }

    // Short IS-A Number
    public static void overloaded(Object n) {
        System.out.println("Number");
    }
}