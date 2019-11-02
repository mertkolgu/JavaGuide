package com.javase._53.anonymousinnerclass;

class Keyboard {
    void write() {
        System.out.println("write!");
    }
}

public class AnonymousInnerClassTest01 {

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.write();

        // anonymous class
        Keyboard keyboardAnonymous = new Keyboard() {
            @Override
            void write() {
                System.out.println("override for anonymous!");
            }
        };
        keyboardAnonymous.write();
    }
}
