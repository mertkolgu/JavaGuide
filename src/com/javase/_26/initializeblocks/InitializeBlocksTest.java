package com.javase._26.initializeblocks;

class Initialize {
    // genel olarak bir tane tanımlanır
    // fakat birden fazla da tanımlanabilir legaldir.
    // çalışma sırası yukarıdan aşağıya doğrudur!
    static {    // static initializce block
        System.out.println("static initialize block - 1");
    }

    Initialize() {
        System.out.println("Constructor!");
    }

    static {    // static initializce block
        System.out.println("static initialize block - 2");
    }

    // birden fazla tanımlanabilir
    // çalışma sırası yukarıdan aşağıya doğrudur.
    // constructordan önce ÇALIŞIR!
    {   // instance initializce block
        System.out.println("initialize block - 1");
    }

    {   // instance initializce block
        System.out.println("initialize block - 2");
    }
}

public class InitializeBlocksTest {

    public static void main(String[] args) {
        Initialize initialize1 = new Initialize();
        Initialize initialize2 = new Initialize();
        // static initialize blocklar sadece bir kez çalışır.
        // her obje oluşturduğumuzda ise instance initialize blocklar çalışır!
        // ilgili sınıf tipinde obje oluşturduğumuzda çalışır.
        Car car = new Car();
    }
}

class Car {
    //
}
