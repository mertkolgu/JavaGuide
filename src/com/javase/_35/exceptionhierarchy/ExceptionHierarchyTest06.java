package com.javase._35.exceptionhierarchy;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHierarchyTest06 {

    public static void mekanKontrol(int yas) throws IOException {
        if (yas < 18) {
            throw new IOException();    // Checked Exception
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
        } catch (IOException e) {
            System.out.println("18 yaşından küçükler mekana giremez.");
        }
    }
}
