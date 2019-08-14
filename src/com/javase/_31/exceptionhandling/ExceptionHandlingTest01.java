package com.javase._31.exceptionhandling;

public class ExceptionHandlingTest01 {

    public static void main(String[] args) {

        int number = 100;

        // System.out.println(number / 0);  // program crash olur!
        // System.out.println("not work!");

        try {
            System.out.println(number / 0);
            System.out.println("not work");
        } catch (ArithmeticException e) {
            // fırlatılan hatanın ya kendisi ya super tipi olmalıdır
            // yoksa catch bloğuna düşmez!
            System.out.println("exception caught!");
        }

        // try bloğunda bir exception ortaya çıktığında catch bloğunda yakalanırsa program çalışmaya devam eder
        // crash olmaz

        try {
            System.out.println(number / 0);
            System.out.println("not work2");
        } catch (RuntimeException e) {
            // fırlatılan hatanın ya kendisi ya super tipi olmalıdır
            // yoksa catch bloğuna düşmez!
            // public class ArithmeticException extends RuntimeException
            System.out.println("exception caught2!");
        }
    }
}