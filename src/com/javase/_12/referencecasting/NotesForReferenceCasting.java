package com.javase._12.referencecasting;

class Animal {

    public void eat() {
        System.out.println("Animal eat...");
    }
}

class Dog extends Animal {

    public void eat() {
        System.out.println("Dog eat...");
    }

    public void bark() {
        System.out.println("Dog bark...");
    }
}

class Cat extends Animal {

    public void eat() {
        System.out.println("Cat eat...");
    }

    public void meow() {
        System.out.println("Cat meow...");
    }
}

public class NotesForReferenceCasting {

    public static void main(String[] args) {

        Animal animalDog = new Dog();
        // değişken tipi Animal
        // objenin tipi Dog

        // DOWNCASTING İşlemi
        // super -> sub
        Dog dog = (Dog) animalDog;  // yeni bir obje oluşmaz!
        dog.bark();

        // Cat cat = (Cat) animalDog;
        // java.lang.ClassCastException verir
        // cat değişkeni Dog objesini gösteremez!!
        // cat.meow();

        Animal animal = new Animal();
        // obje animal

        // Animal tipindeki objeyi Dog tipindeki değişken göstersin (!)
        // KURAL : bir reference type değişken kendi tipinde ya da subclass'ı  tipinde bir objeyi gösterebilir!
        // super class'ı tipindeki bir objeyi GÖSTEREMEZ!

        // Dog dog2 = (Dog) animal;
        // java.lang.ClassCastException verir!
        // Dog tipindeki değişken Animal tipindeki objeyi gösteremez. Animal super sınıf!
        // Animal IS-A Dog olmalı! (yanlış)
        // tam tersi olarak Dog IS-A Animal

        // Object type IS-A variable type

        // Animal animalKangal = new Kangal();

        // Kangal IS-A Animal

        // Dog dogKangal = (Dog) animalKangal;
        // obje tipi Kangal
        // Değişken tipi Dog
        // Kangal IS-A Dog ? DOĞRUDUR

        Object objectAnimal = new Animal();
        // java.lang.Object sınıfı sınıf hiyerarşisinde en tepede yer alır!

        // bütün classlar için IS-A Object önermesi DOĞRUDUR!
        // Animal IS-A Object DOĞRUDUR!

        // String compileError = (String) dogKangal;
        // hiçbir zaman böyle bir legal casting yapılamaz!
        // String ile Animal. Dog arasında bir hiyerarşik durum söz konusu değil!
        // compile error!

        Dog upcasting = new Dog();
        Animal animalUpcasting = upcasting;     // UPCASTING
        // sub -> super
        // bu işlem her zaman LEGALDİR!

        // downcasting söz konusu olduğunda (Dog dogKangal = (Dog) animalKangal;)
        // açık şekilde/explicity olarak casting yapmamız gereklidir!

        // upcasting işleminde risk yoktur. açık şekilde/explicity olarak casting yapmaya gerek yoktur.
        // kapalı/implicit şekilde yapılır.

        Animal animalUpcastingExplicity = (Animal) upcasting;
    }
}

// upcasting -> yukarıya çevrim
// downcasting -> aşağıya çevrim