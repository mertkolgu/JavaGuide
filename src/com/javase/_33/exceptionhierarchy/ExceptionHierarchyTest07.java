package com.javase._33.exceptionhierarchy;

public class ExceptionHierarchyTest07 {

    public static void ucuncuFonksiyon() {
        int a = 12 / 0;
//        try {
//            int a = 12 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("Bir sayı sıfıra bölünemez.");
//        }
    }

    public static void ikinciFonksiyon() {
        ucuncuFonksiyon();
//        try {
//            ucuncuFonksiyon();
//        } catch (ArithmeticException e) {
//            System.out.println("Bir sayı sıfıra bölünemez.");
//        }
    }

    public static void birinciFonksiyon() {
        ikinciFonksiyon();
//        try {
//            ikinciFonksiyon();
//        } catch (ArithmeticException e) {
//            System.out.println("Bir sayı sıfıra bölünemez.");
//        }
    }

    public static void main(String[] args) {
        // birinciFonksiyon();
        try {
            birinciFonksiyon();
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez.");
        }
    }
}

// Exception Propagation
// iç içe methodlarda exception yakalama

// stack sıralaması
// ucuncuFonksiyon
// ikinciFonksiyon
// birinciFonksiyon
// main

// istenilen methodda try-catch kullanılabilir.