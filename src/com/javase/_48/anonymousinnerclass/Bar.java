package com.javase._48.anonymousinnerclass;

class MyWonderfulClass {

    void go() {
        Bar b = new Bar();
        b.doStuff(
                new Foo() {
                    @Override
                    public void foof() {
                        System.out.println("foofy");
                    }   // end foof method
                }
        );  // end inner class def, arg and b.doStuff stmt.
    }   // end go
}   // end class

interface Foo {
    void foof();
}

public class Bar {
    void doStuff(Foo f) {
        //
    }
}