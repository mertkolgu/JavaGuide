package com.javase._35.exceptionhierarchy;

import java.util.Scanner;

public class ExceptionHierarchyTest05 {

    public static void mekanKontrol(int yas) {
        if (yas < 18) {
            throw new ArithmeticException();    // UnChecked Exception
        } else {
            System.out.println("Mekana hoşgeldiniz.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lüften yaşınızı giriniz : ");
        int yas = sc.nextInt();

        try {
            mekanKontrol(yas);
        } catch (ArithmeticException e) {
            System.out.println("18 yaşından küçükler mekana giremez.");
        }
    }
}
