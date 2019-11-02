package com.javase._37.stringbufferandstringbuilder;

public class NotesForStringBufferAndStringBuilder {

    public static void main(String[] args) {
        // StringBuilder compilerError = "compiler error";
        StringBuilder sb = new StringBuilder("Java");
        // sb = sb + "rules";  // not works
        sb.append(" Rules!");   // obje mutable özelliğe sahiptir kendisine atama yapmaya gerek YOKTUR!

        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);

        sb.insert(3, "INSERT!");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        // String str = sb; // StringBuilder IS-A String DEĞİLDİR!
        String str = sb.toString();
    }
}

// java.lang.StringBuffer
// java.lang.StringBuilder

// Bu sınıfların metotları aynıdır.
// StringBuffer'ın metotları synchronized özelliğe sahiptir. (thread-safe özelliğe sahiptir.)
// StringBuilder'ın metotları ise synchronized değildir. Bu nedenle daha hızlı çalışır.
