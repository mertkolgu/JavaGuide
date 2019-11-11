package com.javase._32.loops;

public class ContinueTest01 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 5) {  // ekrana 3 ve 5'i basmaz
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
