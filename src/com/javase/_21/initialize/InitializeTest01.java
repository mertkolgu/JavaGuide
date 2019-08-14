package com.javase._21.initialize;

public class InitializeTest01 {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getName().length());

        // person.getName();
        // java.lang.NullPointerException
        // null değerine sahip reference type değişken üzerinden instance bir metot çağırmaya kalkarsak!
    }
}

class Person {

    private String name;    // otomatik olarak null değeri assign edilir!
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}