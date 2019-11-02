package com.javase._53.anonymousinnerclass;

interface MyInterface {
    void test1();
}

class Animal {
    void method() {
        System.out.println(getClass());
    }
}

public class AnonymousInnerClassTest02 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.method();
        // interface'in anonymous implementasyon
        // interface'lerin objeleri olmaz!!
        MyInterface myInterface = new MyInterface() {
            @Override
            public void test1() {
                System.out.println(getClass());
            }
        };
        myInterface.test1();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running...");
            }
        };
    }
}
