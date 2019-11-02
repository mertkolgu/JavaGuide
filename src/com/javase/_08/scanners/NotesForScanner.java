package com.javase._08.scanners;

import java.util.Scanner;

public class NotesForScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz : ");
        int age = sc.nextInt();
        System.out.println("Yaşınız : " + age);
    }
}

// java.util.Scanner altında bulunur.
// Scanner kullanıcıdan giriş almak için kullanılır.
