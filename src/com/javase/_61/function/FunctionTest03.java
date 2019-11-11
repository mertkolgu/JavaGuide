package com.javase._61.function;

import java.util.function.Function;

public class FunctionTest03 {

    public static void main(String[] args) {
        Function<String, Integer> f1 = Utiliy::myFunction;
    }
}

class Utiliy {

    public static int myFunction(String str) {
        return str.length();
    }
}
