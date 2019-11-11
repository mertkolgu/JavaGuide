package com.javase._56.thread;

public class ThreadTest02 {

    public static void main(String[] args) {
        Thread print1 = new Thread(new Print("Printer1"));
        Thread print2 = new Thread(new Print("Printer2"));

        print1.start();
        print2.start();
    }
}

class Print implements Runnable {
    private String isim;

    public Print(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " çalışıyor.");

        for (int i = 1; i <= 10; i++) {
            System.out.println(isim + " yazıyor : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı.");
            }
        }
        System.out.println(isim + " işini bitirdi.");
    }
}
