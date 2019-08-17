package com.javase._30.loops;

public class ForLoopTest02 {

    public static void main(String[] args) {

        int i = 0, j = 10;

        for (; i < 10 && j > 0; i++, j--) {
            System.out.print("i = " + i + " - ");
            System.out.println("j = " + j);
        }
    }
}