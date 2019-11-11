package com.javase._56.thread;

public class ThreadTest01 {

    public static void main(String[] args) {
        Printer printer1 = new Printer("Printer1");
        Printer printer2 = new Printer("Printer2");

        printer1.start();   // thread başlıyor
        printer2.start();
    }
}

class Printer extends Thread {
    private String isim;

    public Printer(String isim) {
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
