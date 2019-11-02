package com.javase._32.loops;

public class ContinueTest02 {

    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            if (i == 3 || i == 5) { // ekrana 3 ve 5'i basmaz
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
