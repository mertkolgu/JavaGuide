package com.javase._25.wrapper;

public class WrapperTest06 {

    public static void main(String[] args) {

        Integer number1 = 10;
        Integer number2 = 10;
        Integer number3 = 1000;
        Integer number4 = 1000;

        System.out.println(number1 == number3);
        System.out.println(number2 == number4);

        // == kontrolü reference type değişken için bu iki değişken aynı objeyi mi gösteriyor?
        // evet ise true
        // hayır ise false

        System.out.println("equals check");
        System.out.println(number1.equals(number2));
        System.out.println(number3.equals(number4));
    }
}