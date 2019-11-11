package com.javase._88.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest02 {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> System.out.println("test message"), 3, 5, TimeUnit.SECONDS);
        // public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
        // long initialDelay,
        // long period,
        // TimeUnit unit);
    }
}
