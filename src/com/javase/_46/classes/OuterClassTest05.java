package com.javase._46.classes;

import java.util.Scanner;

class Mathematic {

    private double PI = Math.PI;

    public class Factorial {   // inner class

        public void factorial() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Bir sayı giriniz : ");
            int sayi = sc.nextInt();
            int fakt = 1;

            for (int i = 2; i <= sayi; i++)
                fakt *= i;

            System.out.println("Faktöriyel = " + fakt);
        }
    }

    public class Asal { // inner class

        public boolean asalMi(int sayi) {
            int i = 2;

            while (i < sayi) {
                if (sayi % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public class Alan { // inner class

        public class DaireAlan {    // inner class

            public void daireAlan(int yariCap) {
                System.out.println("Dairenin alanı = " + (PI * yariCap * yariCap));
            }
        }
    }
}

public class OuterClassTest05 {

    public static void main(String[] args) {

        Mathematic.Factorial factorial = new Mathematic().new Factorial();
        Mathematic.Asal asal = new Mathematic().new Asal();
        Mathematic.Alan.DaireAlan daireAlan = new Mathematic().new Alan().new DaireAlan();

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = sc.nextInt();

        if (asal.asalMi(sayi)) {
            System.out.println("Bu sayı asaldır.");
        } else {
            System.out.println("Bu sayı asal değildir.");
        }

        factorial.factorial();
        daireAlan.daireAlan(5);
    }
}