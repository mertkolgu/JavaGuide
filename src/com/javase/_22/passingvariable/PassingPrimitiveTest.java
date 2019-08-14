package com.javase._22.passingvariable;

public class PassingPrimitiveTest {

    public static void main(String[] args) {

        int age = 10;
        System.out.println(age);

        // değişkenin değerinin kendisi değil kopyası verilir.
        // kopya değer alınıp, metoda geçilir.
        // 10 değerini ifade eden bit pattern'inin kopyası alınıp metoda verilir.

        updateNumber(age);
        System.out.println(age);
    }

    static void updateNumber(int number) {
        number = number + 20;
        System.out.println(number);
    }
}