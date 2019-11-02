package com.javase._47.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest05 {

    public static void main(String[] args) {
        // < > diamond
        List<String> list = new ArrayList<String>();
        // E -> String

        // boolean add(E e);
        // boolean add(String e);

        list.add("key1");
        list.add("key1");
        list.add("key2");
        // list.add(10);    // compile error, sadece String eklenebilir.

        List raw = new ArrayList();
        raw.add("key1");
        raw.add(10);

        List<Integer> numbers = new ArrayList<Integer>();
        // List<int> numbers = new ArrayList<int>();
        // generic ifadede primitiveler kullanılmaz! legal değildir.
        // sadece reference type kullanılabilir.

        // collectionların elemanları objedir. primitive eleman tutmazlar!

        List<Integer> number3 = new ArrayList<>();
        // Code to Interface
        // sol taraf interface -> List
        // sağ taraf implement'den class -> ArrayList
        // esneklik açısından doğru bir yaklaşımdır.

        number3 = new LinkedList<>();
        // LinkedList IS-A List
    }
}
