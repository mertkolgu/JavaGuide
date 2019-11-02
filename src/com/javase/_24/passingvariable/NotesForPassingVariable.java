package com.javase._24.passingvariable;

public class NotesForPassingVariable {

    public static void main(String[] args) {
        Person person = new Person("username", 20);
        System.out.println(person);
        // person değişkenimiz adres bilgisini tutmakta.
        // adres bilgisi -> objenin heap'teki adresi
        // bir reference değişkeni metoda geçtiğimizde (passing variable)
        // ilgili adres bilgisi metoda geçer.
        // daha doğru bir ifade ile;
        // adres bilgisinin kendisi değil, kopyası alınır ve metoda bu kopya bilgi geçer.
        updatePerson(person);
        System.out.println(person);
    }

    public static void updatePerson(Person personRef) {
        personRef.setName("new name");
        personRef.setAge(30);
        System.out.println(personRef);
    }
}

class Person {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + "]";
    }
}
