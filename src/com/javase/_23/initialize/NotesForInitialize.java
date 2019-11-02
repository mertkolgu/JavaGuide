package com.javase._23.initialize;

import java.util.Arrays;

public class NotesForInitialize {
    // instance ve static değişkenlere otomatik olarak değerler assign edilir.
    int intVariable;
    byte byteVariable;
    boolean booleanVariable;
    double doubleVariable;
    String stringVariable;
    int[] arrayVariable;

    public static void main(String[] args) {
        NotesForInitialize init = new NotesForInitialize();
        System.out.println(init);
    }

    @Override
    public String toString() {
        return "NotesForInitialize [intVariable = " + intVariable + ", byteVariable = " + byteVariable + ", booleanVariable = " + booleanVariable
                + ", doubleVariable = " + doubleVariable + ", stringVariable = " + stringVariable + ", arrayVariable = " + Arrays.toString(arrayVariable) + "]";
    }
}
