package com.javase._51.thread;

public class NotesForThread {
    //
}

// Thread dediğimizde;

// 1 - public class Thread implements Runnable {
// 2 - çalışan bir iş parçacığı/lightweight process

// birinci noktadan baktığımızda (class, obje açısından) thread objeleri
// diğer java objelerinde olduğu gibi heap'te yaşayacaktır.
// ikinci noktadan baktığımızda -> kendi stack alanına sahip lightweight process

// process ->
// OS'in temel görevleri, kaynak paylaşımı yapmaktır/kaynakları yönetmektir.
// RAM/memory, CPU...

// process kavramı OS(operating system/işletim sistemi) açısından çalışan programlar/uygulamalar anlamına gelir.
// paint, eclipse, word, chrome...

// bir process bir ya da daha fazla thread'e sahiptir.

//------------------------------------------------------------------
// javada her thread çalıştığında kendi stack alanı oluşur.
// javada basit bir helloworld örneğinde bile main thread'i çalışacaktır.

//------------------------------------------------------------------
// Javada threadlerin yönetiminden JVM(java virtual machine) sorumludur!
// JVM mini bir OS gibi çalışır. GC mekanizması, thread mekanizması vs bunları yönetir.

//------------------------------------------------------------------
// Yeni bir "thread" oluşturmak için kullanabileceğimiz yaklaşımlar;

// 1 - java.lang.Thread sınıfını kalıtmak(extends)
// 2 - java.lang.Runnable interfacesini/arabirimini uygulamak(implements)

// class Car extends Thread {}
// Car subclass olduğu noktada daha özelleşmiş/spesifik olması gerekiyor OO açısından.
// Fakat amacımız daha spesifik bir Thread sınıf oluşturmak (çoğu zaman)

// class Car implements Runnable {}
// class Person implements Runnable {}

// bir class N tane interface'yi implements edebilir. herhangi bir kısıtlamaya neden olmaz.
// interface'ler class hiyerarşisinde yer almazlar bağımsız olarak herhangi bir sınıf tarafından kullanılabilirler.