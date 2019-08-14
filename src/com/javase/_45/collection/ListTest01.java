package com.javase._45.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {

        List myList = new ArrayList();

        myList.add("test");
        myList.add(200);
        myList.add(200);
        myList.add(200.54);
        myList.add(new Car());

        // bir raw formattaki List'e herhangi bir tipte eleman ekleyebiliriz.
        // public interface List<E> extends Collection<E> {
        // boolean add(E e);

        // Generic ifadede E'nin tipi neyse add metodundaki E o tipte olacaktır.
        // String ise String, Integer ise Integer, Car ise Car, Person ise Person...

        // burada olduğu gibi herhangi bir E değeri verilmezse buna raw type adı verilir.
        // bu durumda E -> Object tipinde olur.
        // List myList = new ArrayList();

        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.get(2));  // index 0'dan başlar
        System.out.println(myList.contains(200));
        System.out.println(myList.indexOf(200));
        System.out.println(myList.lastIndexOf(200));

        // System.out.println(myList.get(5));   // java.lang.IndexOutOfBoundsException
        // System.out.println(myList.get(-1));  // java.lang.IndexOutOfBoundsException

        System.out.println(myList);
        myList.clear();

        System.out.println(myList);
    }
}

class Car {
    //
}