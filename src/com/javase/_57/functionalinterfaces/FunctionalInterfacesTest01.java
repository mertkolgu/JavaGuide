package com.javase._57.functionalinterfaces;

@FunctionalInterface
interface Sprint {
    public void sprint(Animal animal);
    // birden fazla abstract metot yer alırsa bu interface
    // functional interface olmaktan ÇIKAR!
    // public void sprintV2(Animal animal)
}

@FunctionalInterface
interface SubInterface extends Sprint {
    //
}

// @FunctionalInterface
interface DoesNotHaveMethod {
    // eğer 1 tane abstract metodu yoksa
    // bu interface functional interface DEĞİLDİR!
}

@FunctionalInterface
interface Rollable {
    void roll(float degree);
}

class Animal {
    //
}

public class FunctionalInterfacesTest01 {
    //
}
