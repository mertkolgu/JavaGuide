package com.javase._29.garbagecollection;

import java.util.Date;

public class GarbageCollectionTest02 {

    public static void main(String[] args) {
        Date d1 = getDate();
    }

    public static Date getDate() {
        Date date = new Date();
        Person person = new Person("name", "surname");
        return date;
    }
}
