package com.javase._58.interfaces;

interface MyInterface {
    public default void defaultMethod() {
        System.out.println("MyInterface#defaultMethod");
    }

    public abstract void test1();
}

interface MyInterface2 {
    public default void defaultMethod() {
        System.out.println("MyInterface2#defaultMethod");
    }

    public abstract void test1();
}

class DiamondProblem implements MyInterface, MyInterface2 {

    @Override
    public void test1() {
        //
    }

    @Override
    public void defaultMethod() {
        // aynı isimdeki default metot 2 interface'de de yer almakta.
        // biz bu 2 interface'yi implements ettiğimizde bu durumda derleme hatası verir!
        // mutlaka default metodu override etmemiz gerekir!!!
    }
}

public class DiamondProblemTest01 {
    //
}
