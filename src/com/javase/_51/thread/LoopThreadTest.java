package com.javase._51.thread;

class LoopThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " index : " + i);
        }
    }
}

public class LoopThreadTest {

    public static void main(String[] args) {

        System.out.println("Starting main...");
        LoopThread t1 = new LoopThread();
        t1.setName("Cool-Thread-1");
        t1.start();

        LoopThread t2 = new LoopThread();
        t2.start();
        t2.setName("Cool-Thread-2");

        LoopThread t3 = new LoopThread();
        t3.start();
        t3.setName("Cool-Thread-3");

        // burada 3 tane thread oluşturduk.
        // default olarak ismi Thread-0, Thread-1, Thread-2 şeklinde olmaktadır.
        // çıktının/outputun bir garantisi yoktur.
        // her defasında farklı olabilir.
        // bir thread başladığında, işi bitmeden bir başka thread başlayabilir.
        // her thread'in amacı "run" metodundaki işini(job) tamamlamaktır.
        // run metodu tamamlandığında (start edip yeni thread oluşturduktan sonra)
        // thread -> TERMINATED duruma gelir! artık bu thread'i tekrar start edemeyiz.

        System.out.println("Ending main...");

        // Thread Scheduler mekanizması bu yönetimden sorumludur.
        // Thread Scheduler JVM'in bir parçasıdır.

        // hangi threadin çalışacağının bir garantisi yoktur.
        // 3 tane thread olsun ;
        // thread 1 çalıştı - durdu.
        // thread 2 çalıştı - durdu.
        // thread 3'ün çalışacağının bir garantisi yok.
        // tekrar thread 1 çalışabilir.
        // sırasıyla gidecek diye bir garanti/durum yoktur.

        // Thread Scheduler bizim kontrolümüzde değildir.
    }
}