package com.javase._34.string;

public class NotesForString {

    public static void main(String[] args) {

        String x = "java";
        x.concat(" Rules");
        System.out.println(x);

        String y = "java";
        y = y.concat(" Rules");
        System.out.println(y);

        String z = "java";
        z.toUpperCase();
        System.out.println(z);
    }
}

// java.lang.String
// Java'da otomatik olarak java.lang paketi import edilir.

// String'in her karakteri 16-bit Unicode bir karakterdir.

// String objeleri immutable özelliğe sahiptir.
// immutable -> değişmez anlamına gelmektedir.