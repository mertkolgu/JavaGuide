package com.javase._29.flowcontrol;

public class Example {

    public static void main(String[] args) {

        int x = 2;

        switch (x) {
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            default:
                System.out.println("default");
                break;
        }

        System.out.println();

        int y = 5;

        switch (y) {
            default:
                System.out.println("default");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }
    }
}