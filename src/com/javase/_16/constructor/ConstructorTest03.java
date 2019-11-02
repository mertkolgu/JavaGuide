package com.javase._16.constructor;

public class ConstructorTest03 {

    public static void main(String[] args) {
        //
    }
}

class Employees {

    private String name;
    private int age;
    private int salary;

    public Employees() {
        // ilk ifade (constructordaki) this... ya da super olmalı!
        // birlikte olamaz
        // super(); // LEGAL değildir, derleme hatası verir.
        // super() ifadesinde olduğu gibi, this ifadesi de ilk çalışan ifade/statement olmalıdır.

        //System.out.println("Complie error! Not LEGAL");
        this("guest", 20);
        System.out.println("no-arg constructor");
    }

    public Employees(String name, int age) {
        this(name, age, 5000);
        System.out.println("two parameters constructor");
    }

    public Employees(String name, int age, int salary) {
        super();
        // this();  // compile error. recursive olarak çağırmak istersek derleme hatası alırız. java buna izin vermez.
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("three parameters constructor");
    }
}