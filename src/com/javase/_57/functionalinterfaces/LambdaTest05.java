package com.javase._57.functionalinterfaces;

public class LambdaTest05 {

    public static void main(String[] args) {
        F5 lambda1 = () -> new Duck();
    }
}

@FunctionalInterface
interface F5 {
    public abstract Duck test();
}

class Duck {
    //
}
