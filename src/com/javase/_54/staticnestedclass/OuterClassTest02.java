package com.javase._54.staticnestedclass;

class Mathematic {
    private static double PI = Math.PI;

    public static class Alan {

        public static void daireAlan(int yariCap) {
            System.out.println("Dairenin alanı = " + (PI * yariCap * yariCap));
        }
    }
}

public class OuterClassTest02 {

    public static void main(String[] args) {
        Mathematic.Alan alan = new Mathematic.Alan();
        alan.daireAlan(5);
        Mathematic.Alan.daireAlan(5);
    }
}
