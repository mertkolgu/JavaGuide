package com.javase._51.thread;

public class NotesForThreadSleep {
    //
}

// sleep metodu -> static
// InterruptedException bir checked exception'dır.
// yani bu metodu çağırdığımızda handle or declare kuralına uymamız gerekecektir.
// native bir metottur. JVM tarafından uygulanmaktadır.

// java.lang.Thread sınıfında yer alır.
// public static native void sleep(long millis) throws InterruptedException;
// public static void sleep(long millis, int nanos throws InterruptedException {

// 1 milisaniye 10^6 nanosaniye yapar.

// sleep metodu o an çalışan thread'i belirtilen süre kadar askıya alır/uyutur/susped.
// sleep metodundaki süre bittikten sonra ilgili thread'in hemen o an çalışacağının bir garantisi yoktur.
// sleep edilen thread süre bittikten sonra tekrar runnable durumda olur ve
// thread scheduler tarafından tekrar seçilip çalıştırılması gerekir.

// minimum olarak en az verilen süre kadar çalışmayacaktır.

// Thread.sleep(1000);
// 1000 ms -> 1 saniyedir.

// Thread t = new Thread();
// Thread t2 = new Thread();

// t.sleep(1000); -> degisken üzerinden sleep metodunu çağırmamız
// ilgili thread'in (t) 1000 milisaniye sleep edileceği anlamına GELMEZ!
// sleep metodu static bir metottur ve o an çalışan thread hangisi ise o thread'i verilen süre kadar sleep eder.
// not : static metotlara değişken üzerinden değil sınıf üzerinden erişmek doğru yaklaşımdır.

// t.sleep(1000); yanlış bir yaklaşımdır.
// Thread.sleep(1000); doğru yaklaşım (static metot)