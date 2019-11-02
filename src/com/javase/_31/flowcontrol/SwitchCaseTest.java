package com.javase._31.flowcontrol;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İşleminizi giriniz : ");
        int islem = sc.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Birinci işlem");
                break;  // break konmazsa diğer case çalışmaya başlar
            case 2:
                System.out.println("İkinci işlem");
                break;
            case 3:
                System.out.println("Üçüncü işlem");
                break;
            case 4:
                System.out.println("Dördüncü işlem");
                break;
            default:
                System.out.println("Geçersiz işlem");
                break;
        }
    }
}
