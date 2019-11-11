package com.javase._58.interfaces;

interface CoolInterfaces {

    public static void staticTestMethod() {
        System.out.println("Static Test Method!");
    }

    // static metotlar private tanımlanabiliyor. (java 9'da geldi)
    private static void staticTestMethod2() {
        System.out.println("Static Test Method!");
    }
}

public class InterfaceFeatureTest01 {

    public static void main(String[] args) {
        CoolInterfaces.staticTestMethod();
    }
}
