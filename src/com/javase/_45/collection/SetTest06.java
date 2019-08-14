package com.javase._45.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest06 {

    public static void main(String[] args) {

        Person person1 = new Person("1000", "username", "usersurname", 25);
        Person person2 = new Person("1000", "username", "usersurname", 25);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        Set<Person> set = new HashSet<>();

        set.add(person1);
        set.add(person2);
        // Set yapısı DUPLICATE elemana izin vermez!
        // equals true ise duplicate anlamına gelir.
        // equals ve hash code metodlarını override edersek bu durumda equals true olur!

        System.out.println(set.size());
    }
}