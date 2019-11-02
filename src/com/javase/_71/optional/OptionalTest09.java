package com.javase._66.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class OptionalTest09 {

    public static void selectHighestTemperature(Stream<Double> temperatures) {

        Optional<Double> max = temperatures.max(Double::compareTo);

        // public boolean isPresent() {
        if (max.isPresent()) {
            System.out.println(max.get());
        }
    }

    public static void selectHighestTemperature(DoubleStream temperatures) {

        OptionalDouble max = temperatures.max();
        max.ifPresent(System.out::println);

        // public void ifPresent(DoubleConsumer action) {

        // DoubleConsumer
        // void accept(double value);
    }
}