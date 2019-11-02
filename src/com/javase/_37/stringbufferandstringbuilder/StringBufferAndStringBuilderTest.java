package com.javase._37.stringbufferandstringbuilder;

public class StringBufferAndStringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");

        System.out.println(sb1.equals(sb2));    // false olur!!
        // StringBuilder objesi üzerinden equals KULLANMA!
        // bu direkt == ile aynı anlama gelir.
        // çünkü bu sınıflarda equals metodu override edilmemiştir!
        System.out.println(sb1.toString().equals(sb2.toString()));  // true
    }
}
