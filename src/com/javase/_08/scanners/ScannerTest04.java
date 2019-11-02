package com.javase._08.scanners;

import java.util.Scanner;

public class ScannerTest04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yas1 = sc.nextInt();
        int yas2 = sc.nextInt();
        int yas3 = sc.nextInt();
        System.out.println("yaş1 : " + yas1 + " yaş2 : " + yas2 + " yaş3 : " + yas3);
    }
}

// int değerlerde input alırken enter'a basmak yerine
// değerler arasında bir boşluk bırakmak enter'a basmakla aynı işlevi görür.
