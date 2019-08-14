package com.javase._51.thread;

class SynchronizedTest {

    public void doStuff() {

        System.out.println("not synchronized");
        // bu kısma aynı obje (SynchronizedTest) üzerinden N tane thread girebilir.

        synchronized (this) {
            // bu kısma ise aynı obje (SynchronizedTest) üzerinden sadece 1 tane thread girebilir.
            System.out.println("synchronized");
        }
    }

    public synchronized void doStuffV2() {
        System.out.println("synchronized");
    }

    // static metotlar da Synchronized olabilir.
    // There is such a lock; every class loaded in Java has a corresponding instance
    // of java.lang.Class representing that class. It's that java.lang.Class
    // instance whose lock is used to protect the static methods of
    // the class (if they're synchronized)

    // her class'a karşılık java.lang.Class tipinde bir instance yer almaktadır.
    // static metotlar için ilgili class'a karşılık gelen instance'ın lock'ı kilidi kullanılır.
    public static synchronized int getCount() {
        // buraya aynı anda sadece bir tane thread girebilir.
        // farklı objeler üzerinde thread'ler çalışsa da!!
        return 0;
    }

    public static int getCountV2() {

        synchronized (SynchronizedTest.class) {
            return 0;
        }
    }
}