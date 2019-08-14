package com.javase._12.referencecasting;

public class ReferenceCastingTest {

    public static void main(String[] args) {

        Animal[] array = {new Animal(), new Dog(), new Animal(), new Cat()};

        for (Animal animal : array) {
            if (animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }
    }
}