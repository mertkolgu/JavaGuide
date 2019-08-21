package com.javase._11.polymorphism;

class Overloaded {

    void method(int number) {
        System.out.println("int");
    }

    protected void method(long number) {
        System.out.println("long");
    }

    // dönüş tipi değişebilir!
    // access level değişebilir!
    public byte method(byte b) {
        return 10;
    }

    // method ismi aynı ise parametre listesi farklı olmalıdır!
    // derleme hatası verir!
    // dönüş tipi farklı olsa da fark etmez!
}

public class OverloadedTest01 {

    public static void main(String[] args) {

        Overloaded over = new Overloaded();

        over.method(100);
        over.method(100L);
    }
}