package com.javase._15.returntypes;

public class NotesForReturnTypes {
    //
}

// covariant return type
// override metotlarda dönüş tipi değişmez.
// fakat covariant return type olabilir!

class Computer {
    //
}

class Laptop extends Computer {
    //
}

class Store {
    public Computer buyComputer() {
        return new Computer();
    }
}

class EStore extends Store {
    @Override
    // override metotlarda dönüş tipi subclass olabilir.
    // covariant return type adı verilir.
    public Laptop buyComputer() {
        return new Laptop();
    }
}


