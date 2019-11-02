package com.javase._12.inheritance;

public class InheritanceTest {
    //
}

abstract class Araba {
    public abstract String brand();
    public abstract int getPrice();

    // bu metodlar kalıtm vasıtasıyla kullanılabilir.
    // böylelikle diğer sınıflar için yazmamış oluruz.
    // code duplication önlendi!
    public void drive() {
        System.out.println("drive...");
    }

    public void stop() {
        System.out.println("stop...");
    }

    public int door() {
        return 4;
    }
}

class Audi extends Araba {

    @Override
    public String brand() {
        return "Audi";
    }

    @Override
    public int getPrice() {
        return 254854;
    }

    @Override
    public int door() {
        return 2;
    }
}

class Mercedes extends Araba {

    @Override
    public String brand() {
        return "MERCEDES 5S";
    }

    @Override
    public int getPrice() {
        return 3248541;
    }

    @Override
    public int door() {
        return 5;
    }
}

class Ford extends Araba {

    @Override
    public String brand() {
        return "Ford Focus";
    }

    @Override
    public int getPrice() {
        return 12343;
    }
}

class Toyota extends Araba {

    @Override
    public String brand() {
        return "Toyota";
    }

    @Override
    public int getPrice() {
        return 35423;
    }
}

// n tane subclass olabilir.
