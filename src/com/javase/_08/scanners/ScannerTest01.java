package com.javase._08.scanners;

import java.util.Scanner;

public class ScannerTest01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Adınızı ve Soyadınızı Giriniz : ");
        String name = sc.nextLine();
        System.out.println("Adınız : " + name);
    }
}
