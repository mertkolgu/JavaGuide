package com.javase._05.declaremembers.finaltest;

public class FinalMethodTest {
    //
}

final class FinalClass {
    //
}

// class SubFinalClass extends FinalClass {}

class SuperClass {

    void testMethod() {
        //
    }

    final void finalMethod() {
        //
    }
}

class SubClass extends SuperClass {

    void testMethod() {
        //
    }

    // final methodlar override edilemezler!
    // void finalMethod() {}
}