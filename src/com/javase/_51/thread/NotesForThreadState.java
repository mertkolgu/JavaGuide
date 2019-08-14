package com.javase._51.thread;

public class NotesForThreadState {

    // java.lang.Thread sınıfında
    // public enum State {} yer alır.

    /**
     * Thread state for a thread which has not yet started.
     */
    // NEW

    // Thread objesini oluşturduğumuzda fakat henüz start metodunu çağırmadığımızda
    // thread'in durumu NEW
    // Thread objesi mevcuttur.

    // RUNNABLE
    // ilk olarak start metodunu çağırdığımızda ilgili thread RUNNABLE duruma geçer!
    // block/sleeping/waiting gibi durumlardan tekrar RUNNABLE duruma geçer!

    // RUNNABLE durumu bir thread'in JVM(Java Virtual Machine)/Thread Scheduler
    // tarafından seçilmeye uygun hale geldiği durumdur.
    // yani çalışması için seçilmeye uygun hale geldiği durumdur.(eligible)

    // RUNNING ->
    // RUNNING diye bir durum enum'da yer almaz.
    // RUNNING durumundan kastımız o an çalışan thread.
    // çalışan bir thread blocked/waitigin/sleeping gibi durumlara geçebilir.
    // ya da t süresi kadar çalışır durur. Runnable duruma geçer.

    // WAITING
    // Bu durumda thread çalışmaya uygun halde değildir. thread alive durumdadır.
    // WAITING durumundaki bir thread, thread schedular tarafından seçilmeye uygun halde değildir.
    // Sadece RUNNABLE durumundaki thread'ler thread scheduler tarafından seçilebilir.

    // public final void wait() throws InterruptedException
    // public final void join() throws InterruptedException

    // bir thread bir başka thread'in/diğer thread'in belirli bir işi yapmasını bekliyor demektir.
    /*
     * A thread that is waiting indefinitely for another thread to perform a
     * particular action is in this state.
     */

    // TIMED_WAITING
    // thread çalışmaya uygun halde değildir. WAITING durumunun t/belirli zaman kadar beklenildiği senaryolardır.

    // join metodunun overloaded versiyonları vardır.
    // public final synchronized void join(long millis)

    // public final native void wait(long timeout) throws InterruptedException;

    // public static native void sleep(long millis) throws InterruptedException;


    // BLOCKED
    // snycronized javada bir keyword'dür. metotlarda ve blocklarda kullanılabilir.
    // javada objelerin kilitleri(lock) vardır.

    // 2 tane thread aynı obje üzerinden method1 çağırsın;
    // Thread-1 geldi metoda girdi objenin kilidini alır.
    // metot bitene kadar bir başka thread bu metoda giriş yapamaz!!!
    // bu durumda diğer thread'i blocklar!
    // bu durumda diğer thread/bekleyen thread'ler BLOCKED durumdadır.
    // snycronized method1() {}

    // TERMINATED
    // Thread'in çalışmasının sonlandığı yani run metodunun tamamlandığı durumdur.
    // bir thread tamamlandığında tekrar RUNNABLE'a geçemez!

    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // NEW state'inde
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("My Job is running...");
    }
}