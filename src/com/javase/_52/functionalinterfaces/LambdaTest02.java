package com.javase._52.functionalinterfaces;

@FunctionalInterface
interface Calculator {
    int operation(int number1, int number2);
}

public class LambdaTest02 {

    public static void main(String[] args) {

        Calculator lambda1 = (int n1, int n2) -> n1 + n2;
        Calculator lambda2 = (n1, n2) -> n1 - n2;

        // açık şekilde return ifadesini eklediğimizde
        // bu durumda süslü parantez gereklidir.

        Calculator lambda3 = (n1, n2) -> {
            return n1 * n2;
        };

        Calculator lambda4 = (n1, n2) -> {
            System.out.println("Hello Calculator");
            return n1 / n2;
        };

        System.out.println(lambda1.operation(10, 20));
        System.out.println(lambda2.operation(10, 20));
        System.out.println(lambda3.operation(10, 20));
        System.out.println(lambda4.operation(10, 20));
    }
}