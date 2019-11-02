package com.javase._53.interfaces;

interface Animal {

    public default void eat() {
        System.out.println("Eating...");
    }

    public default void run() {
        System.out.println("Running...");
    }

    public static void breathe() {
        System.out.println("Breating...");
    }
}

class Dog implements Animal {

    // interface'lerde yer alan default metotları override edebiliriz!!!
    @Override
    public void run() {
        System.out.println("Dog running...");
    }
}

public class InterfaceFeatureTest02 {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.eat();
        animal.run();

        Animal.breathe();
        // Dog.breathe();   // legal değil!
        // animal.breathe();   // legal değil!
        // interface'lerdeki static metotları sadece
        // interfaceIsmi.staticMethodIsmi şeklinde çağırabiliriz!
    }
}

class Super {
    public static void test() {
        //
    }
}

class Sub extends Super {
    //
}