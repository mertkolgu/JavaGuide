package com.javase._16.constructor;

public class NotesForConstructorChaining {

    public static void main(String[] args) {
        // Dog dog = new Dog();
        Kangal kangal = new Kangal();
    }
}

// constructor chaining -> yapılandırıcı zinciri
// constructor, yapılandırıcı, kurucu gibi Türkçe karşılıklar görülebilir.

// ilk olarak Dog sınıfında yer alan constructor çalışır.
// super() ifadesi olduğu için Animal sınıfındaki constructor'a gider.
// sonrasında java.lang.Object e gider.

class Animal {

    Animal() {
        // System.out.println("compile error!");    // İLK İFADE super() olmalıdır! bu şekilde derleme hatası verir.
        super();    // super() ifadesi açık şekilde yazılırsa, ilk ifade olmalıdır.
        System.out.println("Animal constructor...");
    }
}

class Dog extends Animal {

    Dog() {
        // constructorların başında ilk çalışan ifade super() ifadesidir.
        // bir üst sınıfta yer alan parametre almayan constructor'ı çağır
        super();
        System.out.println("Dog constructor...");
    }
}

class Kangal extends Dog {

    Kangal() {
        super();
        System.out.println("Kangal constructor...");
    }
}
