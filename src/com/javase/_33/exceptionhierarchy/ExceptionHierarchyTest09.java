package com.javase._33.exceptionhierarchy;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHierarchyTest09 {

    public static void mekanKontrol(int yas) throws InvalidAgeExceptionV2 {
        if (yas < 18) {
            throw new InvalidAgeExceptionV2("InvalidAge");
        } else {
            System.out.println("Mekana hoşgeldiniz..");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı girin : ");
        int yas = sc.nextInt();

        // Checked Exception olduğu için try-catch kullanmak zorundayız.
        try {
            mekanKontrol(yas);
        } catch (InvalidAgeExceptionV2 e) {
            e.printStackTrace();
        }
    }
}

class InvalidAgeExceptionV2 extends IOException { // kendimiz Checked Exception oluşturduk

    public InvalidAgeExceptionV2(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasıdır...");
    }
}