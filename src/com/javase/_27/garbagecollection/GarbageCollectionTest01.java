package com.javase._27.garbagecollection;

public class GarbageCollectionTest01 {

    public static void main(String[] args) {

        Person person = new Person("user_name", "user_surname");
        person = null;
        // person = null dediğimizde person değişkeni ilgili objeyi göstermez.
        // bu objeyi gösteren başka bir reference değişken yok.
        // bu nokta itibariyle artık bu obje sahipsiz kaldı.
        // bu nedenle artık garbage collector tarafından temizlenmeye uygun hale geldi.
        // hemen temizleneceğinin bir garantisi yoktur.
    }
}

class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }
}