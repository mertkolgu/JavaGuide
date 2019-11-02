package com.javase._31.flowcontrol;

import java.util.Scanner;

public class IfElseTest02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Notunuzu giriniz : ");
        int not = sc.nextInt();

        if (not >= 88) {
            System.out.println("AA");
        } else if (not >= 78 && not <= 87) {
            System.out.println("BA");
        } else if (not >= 72 && not <= 77) {
            System.out.println("BB");
        } else if (not >= 68 && not <= 71) {
            System.out.println("CB");
        } else if (not >= 60 && not <= 67) {
            System.out.println("CC");
        } else if (not >= 52 && not <= 59) {
            System.out.println("DC");
        } else if (not >= 46 && not <= 51) {
            System.out.println("DD");
        } else if (not >= 35 && not <= 46) {
            System.out.println("FD");
        } else {
            System.out.println("FF");
        }
    }
}
