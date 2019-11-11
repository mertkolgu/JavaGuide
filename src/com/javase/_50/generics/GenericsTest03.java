package com.javase._50.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest03 {
    public static void main(String[] args) {
        Animal animalRef = new Dog();
        // Dog IS-A Animal

        // List<Animal> list = new ArrayList<Dog>();
        // LEGAL DEĞİLDİR!
        // sol taraf ne ise sağ taraf aynı olmalıdır.
        // burada Dog IS-A Animal olsa da durum değişmez.
        List<Animal> listAnimal = new ArrayList<Animal>();
        List<Animal> listAnimal2 = new ArrayList<>();

        List<Dog> listDog = new ArrayList<Dog>();
        List<Dog> listDog2 = new ArrayList<>();

        Animal[] array = new Dog[5];
        // bu durum arrayler için legaldir.

        arrayRuleV1(array);

        listRuleV1(listAnimal);
        // listRuleV1(listDog);    // compile error
        // metot eğer List<Animal> gibi bir şey alıyorsa bu durumda List<Animal> verilmelidir.
        // Dog IS-A Animal olsa da List<Dog> argümanı buraya verilemez!!!
    }
    public static void arrayRuleV1(Animal[] arrayAnimal) {
        arrayAnimal[0] = new Dog();
        // arrayAnimal[1] = new Cat(); // java.lang.ArrayStoreException: com.javase._50.generics.Cat
    }
    public static void listRuleV1(List<Animal> animalList) {
        animalList.add(new Dog());
        animalList.add(new Cat());
    }
}
class Animal {
    //
}
class Dog extends Animal {
    //
}
class Cat extends Animal {
    //
}




