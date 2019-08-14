package com.javase._28.operators;

public class OperatorsTest09 {

    public static void main(String[] args) {

        // && -> shortcut ve
        // & -> ve

        int x = 5;

        if (x > 10 && 10 / 0 > 1) {
            //
        }

        if (x > 10 & 10 / 0 > 1) {
            //
        }
    }
}