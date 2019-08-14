package com.javase._51.thread;

import com.javase._45.collection.Person;

public class NotesForThreadSafe {
    //
}

class Calculator {

    private int sum = 0;

    public void add(int value) {
        sum = sum + value;
    }
}

// 2 tane thread olsun;
// t1 ve t2
// bu thread'ler "aynı" Calculator objesi üzerinde çalışsınlar.

// t1 çalıştı, add metodu çalışsın (value 2 olsun)
// sum = sum + value;

// -> sum değişkenin değeri memoryden okunur. -> 0
// -> sum + value işlemi yapılır.
// -> sum değişkeninin güncel değeri memorye yazılır.

// böyle bir işlemde 3 tane adım yer almaktadır.
// burada 3 tane adım olduğu için ve thread'ler interleave/aralıklarla çalışabileceği için risk söz konusudur!

//--------------------------------------------------------------
// t1 geldi çalıştı sum değeri okudu (sum -> 0)
// hemen okuduktan sonra t1 thread'i durabilir!

// t2 çalışmaya başlasın, geldi, sum değerini okudu (sum -> 0)

// t1 çalışmaya devam etsin, value 2 olsun,
// sum + value -> 0 + 2 -> 2

// t1 çalışmaya devam etsin,
// sum değeri memorye yazılır -> sum = 2

// t2 çalışmaya devam etsin, value 3 olsun
// t2 daha önceki adımda sum'ın değerini okumuştu (0'dı)
// sum + value -> 0 + 3 -> 3 olarak sum'ın değerini bulur

// t2 çalışmaya devam etsin
// sum değerini memorye yazar -> sum = 3

//--------------------------------------------------------------
// sonuç olarak sum'ın değeri 3 oldu
// oysa 5 olması gerekliydi.

// birden fazla thread "aynı kaynağa"/resource üzerinde değişiklik yaptığında(write) bu problem ortaya çıkabilir.
// race condition durumu

// i++; (ifadesi/statement)

// - i'nin değeri okunur/alınır.
// - i'nin değeri 1 artırılır.
// - i'nin değeri kaydedilir.

// bu üç adım bir thread çalışma döngüsünde/cycle'ında çalışıp tamamlanacağının bir garantisi YOKTUR!

// t1 çalışsın;
// i nin değerini okur, 1 artırır ve DURABİLİR!
// sonrasında t2 çalışabilir...
// sonra t1 çalışıp i'nin değerini kaydedebilir.

//--------------------------------------------------------------
// thread safe -> birden fazla thread aynı anda/eş zamanlı olarak metoda erişmeye çalıştığında
// problem olmaması durumudur.
// problemler; race condition, deadlock, memory consistency error gibi problemlerdir.

// local değişkenler thread safe özellik gösterirler.

class ThreadSafe {

    public void threadSafeMethod() {
        int value = 10;
        value++;

        // bu değişken thread safe özellik gösterir!

        // her thread çalıştığında yeni bir stack alanı oluşur!
        // local değişkenler stack alanında yaşarlar.
        // her thread'in bir local değişkeni olacak.
        // local değişkenler paylaşılmazlar.
        // paylaşılmadığı için de risk oluşturmazlar!
    }

    // javada objeler heap alanında yaşarlar!
    // local değişken her zaman stack alanında yaşar.

    public void testMethod() {
        Person1 p = new Person1();
        // p -> local değişkendir. local değişken olduğu için stack alanında yaşar!
        // p reference değişkenin gösterdiği obje ise heap memoryde yaşar!

        // paylaşılmadığı noktada thread safe olur, geri döndürüldüğünde vs.
        // paylaşıldığında ise risk ortaya çıkar!
        // thread safe özelliğini kaybeder.
    }

    // instance değişkenler ise heap memoryde yaşarlar.
    // birden fazla thread aynı obje referansı üzerinden metodu çağırdığında ve
    // instance değişkeni değiştirdiğinde ortaya problem çıkabilir/risk teşkil etmektedir.
}

class Person1 {
    //
}