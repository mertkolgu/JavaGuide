package com.javase._23.initialize;

public class InitializeTest02 {
    // local değişkenlere otomatik olarak bir değer assign edilmez

    public static void main(String[] args) {
        int number; // uninitialize durumda 0 değil!
        // System.out.println(number);  // compile error

        String str; // null değildir, uninitialize durumdadır!
    }
}

class Car {

    Car() {
        // constructor!
    }

    // Constructor değildir!!! metot olur
    int Car() {
        return 10;
    }
}
