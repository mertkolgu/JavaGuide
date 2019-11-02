package com.javase._13.polymorphism;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return "Animal speaking";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " miyavlıyor.";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " havlıyor.";
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " kişniyor.";
    }
}

public class PolymorphismTest {
    public static void speak(Animal animal) {
        System.out.println(animal.speak());
    }

    public static void speak(Object object) {
        if (object instanceof Dog) {
            Dog dog = (Dog) object;
            System.out.println(dog.speak());
        } else if (object instanceof Cat) {
            Cat cat = (Cat) object;
            System.out.println(cat.speak());
        } else if (object instanceof Horse) {
            Horse horse = (Horse) object;
            System.out.println(horse.speak());
        } else if (object instanceof Animal) {
            Animal animal = (Animal) object;
            System.out.println(animal.speak());
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Cat("Lemon");
        Animal animal2 = new Dog("Dog");
        Animal animal3 = new Horse("Şahbatur");

        System.out.println(animal1.speak());
        System.out.println(animal2.speak());
        System.out.println(animal3.speak());

        speak(new Cat("Tekir"));
        speak(new Dog("Karabaş"));
        speak(new Horse("Gülbatur"));
        speak(animal2);
    }
}
