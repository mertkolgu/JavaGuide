package com.javase._13.polymorphism;

class Computer {
    int processor = 2;
    static int ram = 4;

    public void boot() {
        System.out.println("Computer Booting...");
    }

    public static void shutdown() {
        System.out.println("Computer Shutdown...");
    }

    private void reset() {
        System.out.println("Computer Reset...");
    }

    public final void install() {
        System.out.println("Computer Install...");
    }
}

class Laptop extends Computer {
    // Java'da sadece instance methodlar override edilir.
    // bu işlem override değildir.
    // yani burada önemli nokta değişkenin tipidir!
    int processor = 8;      // instance değişken
    static int ram = 16;    // static değişken

    @Override
    public void boot() {
        System.out.println("Laptop Booting...");
    }

    // @Override
    // @Override annotationi sadece override edilen metotlar için kullanılabilir!
    // Java'da static methodlar override EDİLEMEZLER!
    public static void shutdown() {
        System.out.println("Laptop Shutdown...");
    }

    public void retina() {
        System.out.println("Cool Retina...");
    }

    // @Override
    // private metotlar override edilemezler!
    // çünkü visible/görünür değildir.
    private void reset() {
        System.out.println("Computer Reset...");
    }

    // @Override
    // final metotlar override edilemezler!
//    public final void install() {
//        System.out.println("Computer Install...");
//    }
}

public class OverrideTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        // Computer computer -> Computer tipinde bir değişken tanımlıyoruz.
        // Java'da 8 tane primitive tip değişken vardır.
        // byte, short, int, long, float, double, char, boolean
        // bunun dışındaki bütün değişkenler reference type variable'dır.

        // String ? -> reference type
        // Integer -> reference type
        // int [] -> reference type

        // bir başka açıdan değişkenler
        // - local değişken
        // - instance değişken
        // - static değişken

        // bu değişken LOCAL ve refence type değişkendir!

        // Computer(); -> constructorı çağırır.

        // = operatörü assignment/atama operatörü

        // Java'da objeler Heap Memory'de yaşarlar.

        // local değişkenler stack'te yaşarlar
        // instance ve static değişkenler ise heap'te yaşarlar
        computer.boot();

        Laptop laptop = new Laptop();
        laptop.boot();

        Computer laptopComputer = new Laptop();
        // 1 - değişkenin tipi Computer tipinde!
        // 2 - objenin tipi ise Laptop'tır!

        // Laptop computerLaptop = new Computer();
        // Laptop IS-A Computer önermesi DOĞRUDUR.
        // Computer IS-A Laptop önermesi YANLIŞTIR.

        // Java'da bir reference type değişken kendi tipinde ya da
        // subclass/alt sınıf tipinde bir objeyi gösterebilir.
        laptopComputer.boot();
        laptopComputer.shutdown();
        // laptopComputer.retina();    // legal değildir!

        // override metotlar için dynamic dispatch denilen mekanizma işler!
        // dynamic method dispatch
        // hangi override metodun çalışacağına java run time'da karar verir!
        // objenin tipine göre ilgili metot çalışır.

        System.out.println(laptopComputer.processor);
        System.out.println(laptopComputer.ram);
        // DEĞİŞKENİN TİPİ ÖNEMLİDİR
        // laptopComputer reference type değişkenin tipi Computer olduğu için
        // burada Computer sınıfında yer alan değerler yazılır.
        // Değişkenler için OVERRIDE diye bir kavram söz konusu değildir!
    }
}
