package com.javase._57.supplier;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest02 {

    public static void main(String[] args) {

        // public static<T> Stream<T> generate(Supplier<? extends T> s) {
        // public int nextInt() {

        Supplier<Integer> supplier = new Random()::nextInt;
        // Supplier<Integer> supplierV2 =  Random::nextInt;
        Supplier<String> supplierV3 = String::new;
        // public String() {

        // public Integer(String s)
        Function<String, Integer> f1 = Integer::new;
        Function<Integer, Integer> f2 = Integer::new;

        Stream.generate(supplier).limit(10).forEach(System.out::println);

        Supplier<Integer> supplierV4 = SupplierTest02::createRandomNumber;

        System.out.println();
        Stream.generate(supplierV4).limit(10).forEach(System.out::println);
    }

    public static Integer createRandomNumber() {
        return new Random().nextInt();
    }
}