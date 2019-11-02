package com.javase._17.statics;

public class Frog {
    static int counter = 0;
    int frogCount = 0;

    public Frog() {
        frogCount += 1; // Modify the value in the constructor
        counter++;
    }

    public static void main(String[] args) {
        Frog f1 = new Frog();
        Frog f2 = new Frog();
        Frog f3 = new Frog();

        System.out.println("Frog count is now " + f3.frogCount);
        System.out.println("Counter : " + counter);
    }
}
