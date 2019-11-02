package com.javase._32.loops;

public class ForLoopTest01 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 33, 45, 646};

        for (int e : numbers)
            System.out.println(e);
    }
}

// for-each döngüsü array'lerde işimizi kolaylaştırır.
