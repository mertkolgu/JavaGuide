package com.javase._56.thread;

public class NotesForThread {
    //
}

// Thread dediğimizde;

// 1 - public class Thread implements Runnable {}
// 2 - çalışan bir iş parçacığı/lightweight process

// birinci noktadan baktığımızda (class, obje açısından) thread objeleri
// diğer java objelerinde olduğu gibi heap'te yaşayacaktır.
// ikinci noktadan baktığımızda -> kendi stack alanına sahip lightweight process

// thread bir process'in içinde bulunan bir çalışma ünitesidir ve her Java programı en az bir thread'e sahiptir.
// eğer biz hiç thread oluşturmasak bile Java projeleri main metodunu çalıştırırken bir tane main thread oluşturur.
// bu main thread'inin yanına kendimiz değişik işlemler yaptıramak için kendi thread'lerimizi oluşturabiliriz.

// thread'ler process'lerin içinde oluştuğu için process'lerin oluşturduğu
// bellek alanına direkt olarak erişim sağlayabilirler.

// ayrıca bellek alanından ayrı olarak her thread'in sadece kendinin erişebileceği bir tane thread stack'i bulunur.

// javada her thread çalıştığında kendi stack alanı oluşur.
// javada basit bir helloworld örneğinde bile main thread'i çalışacaktır.

// Javada threadlerin yönetiminden JVM(java virtual machine) sorumludur!
// JVM mini bir OS gibi çalışır. Garbage Collector mekanizması, thread mekanizması vs bunları yönetir.

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

//------------------------------------------------------------------
// Process
// OS'in temel görevleri, kaynak paylaşımı yapmaktır/kaynakları yönetmektir.
// RAM/memory, CPU...

// process kavramı OS(operating system/işletim sistemi) açısından çalışan programlar/uygulamalar anlamına gelir.
// paint, eclipse, word, chrome...
// her process bellekte kendi memory space'ine (bellek alanına) sahiptir.

// bir process bir ya da daha fazla thread'e sahiptir.

// bir Java uygulamasını çalıştırdığımız zaman bu uygulama JVM(java virtual machine) üzerinde çalışacak bir
// process'e dönüşür. Java projeleri process'e dönüştükleri zaman kendi memory space'ini veya diğer adıyla
// heap'in oluşturur. Eğer elimizde 2 tane çalışır durumda uygulamamız(process) varsa bu uygulamalar
// birbirlerinin bellek alanlarına (memory space) ya da heap'lerine erişemezler.

//------------------------------------------------------------------
// MultiTasking, bilgisayarın birçok process(işlem)i aynı anda çalıştırmasıdır.
// Örneğin; Chrome ile Spotify'ın aynı anda çalışması gibi.

// MultiThreading ise bir process içinde bir çok çalışma ünitesi oluşturup(thread) birçok işi bir arada yapmaktır.
// Örneğin; Word'de yazı yazarken aynı anda Word içinde yazdıklarımızın kontrol edilebilmesi

// thread'lerin paralel olarak çalışmasına concurrency (eşzamanlılık) denir.

//------------------------------------------------------------------
// Deadlock, birçok thread birbirini bekliyor ve hiçbir yere ilerlemiyor
// iki tane lock'un farklı thread'lerde bulunup iki tane thread'in diğer lock'u beklemesi

//------------------------------------------------------------------
// Semaphore, aynı anda birden fazla thread'in çalışmasını istediğimiz zaman kullanılırız

//------------------------------------------------------------------
// public interface Runnable {} geriye değer döndürmez
// public interface Callable<V> {} geriye değer döndürür
// public interface Future<V> {} geriye değer döndürür

// Future<Integer> future = executorService.submit(new Callable<Integer>() {}
// Future<?> future = executorService.submit(new Callable<Integer>() {}
// future referansını türden bağımsız kullanmak istiyorsak
// Future<Integer> yerine Future<?> future yazmamız gerekir

//------------------------------------------------------------------
// InterruptedException iki türlü oluşabilir
// 1 - ya thread'i bilgisayar kendi sonlandırıyordur/yarıda kesiyordur
// 2 - ya da programcı thread'i yarıda kesmek istiyordur

// interrup, bir thread'in çalışmasını bitirmiyor sadece o thread'i yarıda kesiyor
// thread uyuyorsa thread'i uyandırıyor ya da thread belli bir yerde bekliyorsa beklediği yerden çıkarabilir
