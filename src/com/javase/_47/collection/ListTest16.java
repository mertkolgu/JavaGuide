package com.javase._47.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest16 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("Python");
        arrayList.add("Php");
        arrayList.add("Go");

        Collections.sort(arrayList, new BuyuktenKucugeString());

        for (String s : arrayList)
            System.out.println(s);
    }
}

class BuyuktenKucugeString implements Comparator<String> {
    // büyükten küçüğe sıralama yapacaksak
    // soldaki değer sağdaki değerden büyükse -1 döndürmesi gerekiyor
    // soldaki değer sağdaki değerden küçükse +1 döndürmesi gerekiyor
    // iki değer birbirine eşit ise 0 döndürmesi gerekiyor

    // küçükten büyüğe sıralama yapacaksak
    // soldaki değer sağdaki değerden küçükse -1 döndürmesi gerekiyor
    // soldaki değer sağdaki değerden büyükse +1 döndürmesi gerekiyor
    // iki değer birbirine eşit ise 0 döndürmesi gerekiyor
    @Override
    public int compare(String o1, String o2) {
        // büyükten küçüğe sıralama
        return -o1.compareTo(o2);

        // küçükten büyüğe sıralama
        // return o1.compareTo(o2);
    }
}
