package com.javase._21.assignment;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();
        // person değişkeni, Person objesinin adres bilgisini tutar.

        Person person1 = person;
        // assignment yaptığımızda, artık person1 de ilgili Person objesini göstermektedir.

        person1 = null;
        // person1 ilgili adres bilgisini uçurduk!
        // artık herhangi bir adres bilgisine sahip değil.
        // objeye bir müdahele yapmadık.
    }
}
