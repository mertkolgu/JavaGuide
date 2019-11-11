package com.javase._57.functionalinterfaces;

@FunctionalInterface
interface LambdaFinal {
    void printMessage(String message);
}

public class LambdaTest04 {

    public static void main(String[] args) {
        // Lambda functions can refer to local variables from the enclosing scope. The
        // variable needs to be explicitly declared final or that variable will be
        // treated as effectively final.

        String var1 = "value1";
        final String var2 = "value2";
        String var3 = "value3";

        // LambdaFinal lambdaFinal = (String msg) -> System.out.println(msg + " ," + var1 + " , " + var2 + " ," + var3);
        // compile error verir var3 legal değil, effectively final değil!

        LambdaFinal lambdaFinal = (String msg) -> System.out.println(msg + " ," + var1 + " , " + var2);
        var3 = "not effectively final";

        // Local variable var3 defined in an enclosing scope must be final or effectively final.

        // Why is that local variables are considered effectively final when they are
        // accessed in lambda expressions? The reason is that such mutation is not
        // thread safe.
    }
}
