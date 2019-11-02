package com.javase._55.nestedinterface;

public interface OuterInterfaceTest {
    // The interface member type NestedInterface can only be public
    // nested interface'ler static özellik gösterirler!
    static interface NestedInterface {
        // private abstract void method(); // legal değildir
        // nested interfaceler için access level public olmalıdır. (metotlar için!)
    }
    int value = 100;
    // public static final değişkendir!

    // abstract bir metottur!
    // interface'lerin metotları public abstract'tır.
    public void method();
}
