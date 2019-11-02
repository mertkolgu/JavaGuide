package com.javase._31.flowcontrol;

public class NotesForIfElse {

    public static void main(String[] args) {
        int number = 10;
        int number2;
        // tek ifade/tek satır bile olsa if else için süslü parantez KULLAN!

        if (number > 15)
            number2 = 20;

        int number3 = 50;

        if (number > 15) {
            number2 = 20;
        }

        int x = 1;
        int y = 10;
        if (x > 3)
            if (y > 5)
                System.out.println("y > 5");
            else
                System.out.println("else");

        if (x > 3) {
            if (y > 5) {
                System.out.println("y > 5");
            } else {
                System.out.println("else");
            }
        }

        Person person = new Person("admin", 30);
        Address address = new Address("İstanbul", "TR");
        // 1 - if bloğunu mümkün mertebe kısa tut
        // 2 - &, | noktasında algoritmaya göre parantezlere dikkat et.
        // 3 - if bloğunu böl
        if (person.getAge() > 20 && person.getName().equals("admin") && address.getCity().equals("İstanbul")) {
            //
        }

        boolean personCheck = person.getAge() > 20 && person.getName().equals("admin");
        boolean addressCheck = address.getCity().equals("İstanbul");

        if (personCheck && addressCheck) {
            //
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        super();
        this.setName(name);
        this.setAge(age);
    }

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

class Address {
    String city;
    String country;

    public Address(String city, String country) {
        super();
        this.setCity(city);
        this.setCountry(country);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
