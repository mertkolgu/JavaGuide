package com.javase._36.string;

import java.util.Objects;

public class EqualsContractTest02 {

    public static void main(String[] args) {
        Person person1 = new Person("name", "surname", 20);
        Person person2 = new Person("name", "surname", 20);

        System.out.println(person1 == person2);     // false
        System.out.println(person1.equals(person2));    // true
        // equals metodu override edilmediği durumda == ile aynı şekilde çalışır.
    }
}

class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
