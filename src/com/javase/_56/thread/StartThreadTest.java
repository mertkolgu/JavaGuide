package com.javase._56.thread;

public class StartThreadTest {

    public static void main(String[] args) {
        MyThreadTest myThread = new MyThreadTest();
        System.out.println("Current Thread in main : " + Thread.currentThread().getName()); // main
        // myThread.run();  // bu metodu kendimiz çağırdığımızda YENİ BİR THREAD OLUŞMAZ!
        myThread.start();   // yeni bir thread oluşur/başlar!

        // her thread başladığında yeni bir stack alanı oluşur.
        // her thread'in kendi stack alanı mevcuttur.

        // public synchronized void start() {}
        // start metodu Thread sınıfında yer alır!
        // Runnable interface'sini implements ettiğimizde kendimiz Thread objesi oluşturup,
        // runnable değişkenimizi parametre olarak constructor'a veririz.

        MyRunnableTest myRunnable = new MyRunnableTest();
        // myRunnable.start();  // legal değildir!

        Thread t1 = new Thread(myRunnable);
        t1.start();
        // t1.start();  // java.lang.IllegalThreadStateException
        // aynı thread'i/iş parçacığını 2 kere start edemeyiz!

        // biz start metodunu çağırırız,
        // arka planda yeni bir thread ve stack oluşur,
        // run metodu otomatik olarak çalışır!

        // run metodunu N kere çağırabiliriz.
        // burada yeni bir thread oluşmuyor.
        t1.run();
        t1.run();
        t1.run();
    }
}
