package com.javase._57.supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest04 {

    public static void main(String[] args) {

        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();

        // T get();
        // public StringBuilder() {

        // public ArrayList()
        Supplier<ArrayList> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        Supplier<ArrayList> s4 = () -> new ArrayList();
    }
}