package com.javase._33.exceptionhierarchy;

import java.util.Scanner;

public class ExceptionHierarchyTest08 {

    public static void mekanKontrol(int yas) {
        if (yas < 18) {
            throw new InvalidAgeException("InvalidAge");
        } else {
            System.out.println("Mekana hoşgeldiniz..");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı girin : ");
        int yas = sc.nextInt();

        // UnChecked Exception olduğu için try-catch kullanmayabiliriz.
        // mekanKontrol(yas);

        try {
            mekanKontrol(yas);
        } catch (InvalidAgeException e) {
            // System.out.println(e);
            e.printStackTrace();
        }
    }
}

class InvalidAgeException extends ArithmeticException { // kendimiz UnChecked Exception oluşturduk

    public InvalidAgeException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasıdır...");
    }
}