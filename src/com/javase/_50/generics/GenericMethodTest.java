package com.javase._50.generics;

public class GenericMethodTest {

    public static void main(String[] args) {
        Character[] characters = {'J', 'A', 'V', 'A'};
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        String[] strings = {"Java", "Python", "PHP"};
        Ogrenci[] ogrenci = {new Ogrenci("Mert"), new Ogrenci("Mustafa")};

        yazdir(characters);
        System.out.println("************");
        yazdir(integers);
        System.out.println("************");
        yazdir(strings);
        System.out.println("************");
        yazdir(ogrenci);
    }

    public static <E> void yazdir(E[] dizi) {   // generic method
        for (E e : dizi)
            System.out.println(e);
    }
}
