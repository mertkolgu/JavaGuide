package com.javase._34.string;

public class EqualsContractTest02 {

    public static void main(String[] args) {

        Person person1 = new Person("name", "surname", 20);
        Person person2 = new Person("name", "surname", 20);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Person other = (Person) obj;

        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        return true;
    }
}