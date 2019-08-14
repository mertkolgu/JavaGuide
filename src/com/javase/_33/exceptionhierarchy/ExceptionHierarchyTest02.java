package com.javase._33.exceptionhierarchy;

import java.io.FileNotFoundException;

public class ExceptionHierarchyTest02 {

    public static void main(String[] args) throws FileNotFoundException {

        throwUnCheckedException();

        try {
            throwCheckedException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        throwCheckedException();
    }

    public static void throwUnCheckedException() {
        throw new NullPointerException();
    }

    public static void throwCheckedException( ) throws FileNotFoundException {
        throw new FileNotFoundException();
        // throw edilen exception bir checkhed exception bu nedenle throws ifadesi gereklidir.
        // System.out.println("illegal");   // Unreachable code
    }
}