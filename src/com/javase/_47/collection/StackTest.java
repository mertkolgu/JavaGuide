package com.javase._47.collection;

import java.util.Enumeration;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");

        // System.out.println("---Stack for ile Ekrana Basma---");
        // for (String s : stack)
        //    System.out.println(s);

        // System.out.println("---Stack enumeration ile Ekrana Basma---");
        // Enumeration<String> enumeration = stack.elements();
        // while (enumeration.hasMoreElements()) {
        //     System.out.println(enumeration.nextElement());
        // }

        System.out.println("Stack'in son elemanı : " + stack.peek());   // Go
        for (String s : stack)
            System.out.println(s);
        // Java
        // Python
        // Php
        // Go

        System.out.println("Stack'in son elemanı çıkarılıyor : " + stack.pop());    // Go
        for (String s : stack)
            System.out.println(s);
        // Java
        // Python
        // Php

        // stack boşsa true değil ise false döner
        System.out.println("Stack Boş Mu ? : " + stack.isEmpty());  // false

        // stack boşalana kadar while döngüsü devam eder
        while (!stack.isEmpty()) {
            System.out.println("Eleman Çıkarılıyor : " + stack.pop());
            // Eleman Çıkarılıyor : Php
            // Eleman Çıkarılıyor : Python
            // Eleman Çıkarılıyor : Java
        }
        // System.out.println(stack.pop());    // java.util.EmptyStackException
    }
}

// stack LIFO (Last In First Out) şeklinde çalışır