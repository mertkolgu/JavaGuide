package com.javase._47.collection;

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
        // public interface List<E> extends Collection<E> {}
        // boolean add(E e);

        // Generic ifadede E'nin tipi neyse add metodundaki E o tipte olacaktır.
        // String ise String, Integer ise Integer, Car ise Car, Person ise Person...

        // burada olduğu gibi herhangi bir E değeri verilmezse buna raw type adı verilir.
        // bu durumda E -> Object tipinde olur.
        // List myList = new ArrayList();
        System.out.println(myList.size());  // 5
        System.out.println(myList.isEmpty());   // false
        System.out.println(myList.get(2));  // 200 -> index 0'dan başlar
        System.out.println(myList.contains(200));   // true
        System.out.println(myList.indexOf(200));    // 1
        System.out.println(myList.lastIndexOf(200));    // 2

        // System.out.println(myList.get(5));   // java.lang.IndexOutOfBoundsException
        // System.out.println(myList.get(-1));  // java.lang.IndexOutOfBoundsException
        System.out.println(myList); // [test, 200, 200, 200.54, com.javase._45.collection.Car@5b6f7412]
        myList.clear();
        System.out.println(myList); // []
    }
}

class Car {
    //
}
