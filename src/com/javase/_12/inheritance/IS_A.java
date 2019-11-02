package com.javase._12.inheritance;

public class IS_A {
    //
}

class Vehicle {
    //
}

class Car extends Vehicle implements Speedy {
    //
}

class BMW extends Car implements Speedy {
    //
}

interface Speedy {
    //
}

// Car IS-A Vehicle önermesi DOĞRUDUR!
// Vehicle IS-A Car önermesi doğru değildir.

// BMW IS-A Car
// BMW IS-A Speedy
// BMW IS-A Vehicle önermeleri doğrudur.
