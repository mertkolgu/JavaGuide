package com.javase._53.interfaces;

class BaseClass {

    public void foo() {
        System.out.println("BaseClass's foo");
    }
}

interface BaseInterface {

    default public void foo() {
        System.out.println("BaseInterface's foo");
    }
}

public class DiamondProblemTest02 extends BaseClass implements BaseInterface {

    public static void main(String[] args) {
        new DiamondProblemTest02().foo();
    }
}