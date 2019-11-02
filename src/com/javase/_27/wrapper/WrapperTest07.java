package com.javase._27.wrapper;

public class WrapperTest07 {

    public static void main(String[] args) {
        Integer number1 = new Integer(10);
        Integer number2 = new Integer(10);
        // new anahtar kelimesiyle oluşturduğumuzda integer poolda cachelenmez.

        System.out.println(number1 == number2);
        System.out.println(number1.equals(number2));
    }
}
