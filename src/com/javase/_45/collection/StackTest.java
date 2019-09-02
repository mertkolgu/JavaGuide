package com.javase._45.collection;

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

        System.out.println("Stack'in son elemanı : " + stack.peek());
        for (String s : stack)
            System.out.println(s);

        System.out.println("Stack'in son elemanı çıkarılıyor : " + stack.pop());
        for (String s : stack)
            System.out.println(s);

        // stack boşsa true değil ise false döner
        System.out.println("Stack Boş Mu ? : " + stack.isEmpty());

        // stack boşalana kadar while döngüsü devam eder
        while (!stack.isEmpty()) {
            System.out.println("Eleman Çıkarılıyor : " + stack.pop());
        }

        // System.out.println(stack.pop());    // java.util.EmptyStackException
    }
}

// stack LIFO (Last In First Out) şeklinde çalışır