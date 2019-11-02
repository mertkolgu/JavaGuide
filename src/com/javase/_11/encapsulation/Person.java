package com.javase._11.encapsulation;

public class Person {
    private int age;
    private String name;
    // legaldir fakat encapsulation için uygun değildir!
    public String surname;  // n tane noktadan erişim sağlanabilir.

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0)
            age = 0;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
