package com.javase._14.constructor;

public class ConstructorTest02 {
    //
}

class Computers {

    private String brand;
    private String model;

    public Computers(String brand, String model) {
        super();
        this.brand = brand;
        this.model = model;
    }
}

// bu haliyle code derleme hatası verir!
//class Laptop extends Computer {
//    //
//}

class Laptop extends Computer {

//    Laptop() {
//        super();
//        // 1 - java no-arg/parametre almayan constructor tanımlar.
//        // 2 - constructorların başında varsayılan olarak/default super() ifadesi yer alır.
//        // super() ifadesi bir üst sınıftaki no-arg constructor'ı çağırır.
//    }

    Laptop() {
        super("default brand", "v1 model");
        // ya super ifadesini kendimiz açık şekilde yazıp, super/üst sınıfta yer alan bir constructor'ı çağırırız.
        // ya da super sınıfta/üst sınıfta no-args constructor tanımlarız.
    }
}