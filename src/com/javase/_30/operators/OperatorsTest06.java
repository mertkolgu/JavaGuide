package com.javase._30.operators;

public class OperatorsTest06 {

    public static void main(String[] args) {
        int point = 80;
        String result = point < 45 ? "Fail" : "Success";
        System.out.println(result);

        String resultP = point < 45 ? "F" : point > 95 ? "A" : "B";
        System.out.println(resultP);
    }
}
