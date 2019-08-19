package com.javase._88.methods;

public class MethodOverloadingTest01 {

    public static void sum(int number1, int number2) {
        System.out.println("Toplam = " + (number1 + number2));
    }

    public static void sum(int number1, int number2, int number3) {
        System.out.println("Toplam = " + (number1 + number2 + number3));
    }

    public static void sum(long number1, int number2, int number3) {
        System.out.println("Toplam = " + (number1 + number2 + number3));
    }

    public static int sum(byte number1, int number2, int number3) {
        System.out.print("Toplam = ");
        return (number1 + number2 + number3);
    }

    public static int sum(byte number1, int number2) {
        System.out.print("Toplam = ");
        return (number1 + number2);
    }

    public static void main(String[] args) {
        sum(3, 4);
        sum(3, 4, 5);
    }
}

// method overloading;
// dönüş tipi aynı olup değişken sayısı farklı olabilir.
// dönüş tipi ve değişken sayısı aynı olup değişken tipi farklı olabilir.
// dönüş tipi ve değişken tipi farklı olup değişken sayısı aynı olabilir.