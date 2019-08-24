package com.javase._34.string;

public class NotesForString {

    public static void main(String[] args) {

        String x = "java";
        x.concat(" Rules");
        System.out.println(x);

        String y = "java";
        y = y.concat(" Rules"); // stringleri birleştirir
        System.out.println(y);

        String z = "java";
        z.toUpperCase();    // bütün karakterleri büyük harfle yazar
        System.out.println(z.toUpperCase());

        String q = "JAVA";
        q.toLowerCase();    // bütün karakterleri küçük harfle yazar
        System.out.println(q.toLowerCase());
    }
}

// java.lang.String
// Java'da otomatik olarak java.lang paketi import edilir.

// String'in her karakteri 16-bit Unicode bir karakterdir.

// String objeleri immutable özelliğe sahiptir.
// immutable -> değişmez anlamına gelmektedir.