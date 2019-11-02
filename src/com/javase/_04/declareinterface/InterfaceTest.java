package com.javase._04.declareinterface;

public interface InterfaceTest {
    public int a = 4;
    public int b = 5;
    public String test = "test";
    public final int c = 6;

    public static void test() {
        System.out.println("Test");
    }
}

class Test {

    public static void main(String[] args) {
        System.out.println(InterfaceTest.a);
        System.out.println(InterfaceTest.b);
        System.out.println(InterfaceTest.c);
        System.out.println(InterfaceTest.test);
        InterfaceTest.test();
    }
}
