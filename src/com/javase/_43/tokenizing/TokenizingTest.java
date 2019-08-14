package com.javase._43.tokenizing;

import java.util.StringTokenizer;

public class TokenizingTest {

    public static void main(String[] args) {

        String content = "key1 key2 key3";
        StringTokenizer st = new StringTokenizer(content);  // default boşluğa göre ayırır.

        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        String content2 = "key1,key2,key3";
        StringTokenizer st2 = new StringTokenizer(content2, ",");   // default boşluğa göre ayırır.

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}