package com.javase._52.methodlocalinner;

public class NotesForMethodLocalInner {
    private int value = 200;

    public static void main(String[] args) {
        //
    }

    void method() {
        // legal değildir.
        // LocalInner localInner = new LocalInner();
        // localInner.innerMethod();
        class LocalInner {
            String str = "java rule";

            void innerMethod() {
                System.out.println(value);
                // regular inner class'ta olduğu gibi,
                // outer class'ın private üyelerine erişim sağlayabilir.
                System.out.println(str);
                str = str + "!!!";
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.innerMethod();
    }
}
