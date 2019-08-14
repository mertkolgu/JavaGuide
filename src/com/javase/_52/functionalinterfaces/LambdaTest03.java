package com.javase._52.functionalinterfaces;

@FunctionalInterface
interface LambdaFunctionV2 {
    String intKind(int a);
}

public class LambdaTest03 {

    public static void main(String[] args) {

        LambdaFunctionV2 lambdaFunction = (int i) -> {
            if ((i % 2) == 0)
                return "even";
            else
                return "odd";
        };

        System.out.println(lambdaFunction.intKind(10));
        System.out.println(lambdaFunction.intKind(7));
    }
}