package com.javase._89.cyclicbarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LionPenManager {
    private void removeAnimals() {
        System.out.println("Removing animals" + Thread.currentThread().getName());
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen" + Thread.currentThread().getName());
    }

    private void addAnimals() {
        System.out.println("Adding animals" + Thread.currentThread().getName());
    }

    public void performTask() {
        removeAnimals();
        cleanPen();
        addAnimals();
    }
}

public class WithOutCyclicBarrierTest01 {

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask());
        } finally {
            if (service != null)
                service.shutdown();
        }
    }
}
