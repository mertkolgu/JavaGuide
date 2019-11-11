package com.javase._57.functionalinterfaces;

@FunctionalInterface
interface LambdaFunction {
    void call();
}

@FunctionalInterface
interface LambdaFunctionWithParameter {
    void call(int number);
}

@FunctionalInterface
interface LambdaFunctionWithMoreParameters {
    void call(int number, int number2);
}

public class LambdaTest01 {

    public static void main(String[] args) {
        LambdaFunction lambdaFunction = () -> System.out.println("Hello World!");
        lambdaFunction.call();
        // if no parameters, then empty parenthesis () must be provided

        LambdaFunctionWithParameter lambdaFunction2 = (int k) -> System.out.println("Hello World : " + k);
        LambdaFunctionWithParameter lambdaFunction3 = k -> System.out.println("Hello world : " + k);

        LambdaFunctionWithMoreParameters lambdaFunction4 = (k, j) -> System.out.println("Hello world : " + (k + j));
        LambdaFunctionWithMoreParameters lambdaFunction5 = (int k, int j) -> System.out.println("Hello World : " + (k + j));
        // 1'den fazla parametre tanımladığımızda parantez GEREKLİ!
        // k, j derleme hatası verir. (k, j)
        // (int k, j) derleme hatası verir! (int k, int j)

        lambdaFunction2.call(20);
        lambdaFunction4.call(20, 30);
        // As we said, parentheses can be omitted only
        // if there is exactly one parameter and the data type is not specified.
    }
}
