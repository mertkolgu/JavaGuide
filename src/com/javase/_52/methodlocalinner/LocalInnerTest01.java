package com.javase._52.methodlocalinner;

public class LocalInnerTest01 {

    public static void main(String[] args) {

        class Alan {    // local inner class
            public void daireAlan(int yariCap) {
                System.out.println("Dairenin alanı : " + (Math.PI * yariCap * yariCap));
            }
        }
        // local inner class'ın faydası
        // objeyi eğer sadece bu metodun içinde kullanacaksak local inner class kullanmak mantıklı
        Alan alan = new Alan();
        Alan alan1 = new Alan();

        alan.daireAlan(5);
        alan1.daireAlan(3);
    }
}
