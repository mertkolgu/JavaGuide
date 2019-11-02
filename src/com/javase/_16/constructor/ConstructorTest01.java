package com.javase._16.constructor;

class Car {
    //
}

class Computer {
    String brand;
    String model;

    Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Computer() {
        //
    }
}

public class ConstructorTest01 {

    public static void main(String[] args) {
        Car car = new Car();
        // javada yeni bir obje oluşturmak istediğimizde constructor'ı çağırırız!
        Computer computer = new Computer("Apple", "Macbook Pro");
        Computer computer1 = new Computer();
        // biz constructor tanımladığımızda java bizim için no-arg constructor'ı tanımlamaz.
        // bizim bu constructor'ı tanımlamamız gerekir!
    }
}
