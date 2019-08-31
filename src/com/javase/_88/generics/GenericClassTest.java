package com.javase._88.generics;

public class GenericClassTest {

    public static void main(String[] args) {

        Character[] characters = {'J', 'A', 'V', 'A'};
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        String[] strings = {"Java", "Python", "PHP"};
        Ogrenci[] ogrenci = {new Ogrenci("Mert"), new Ogrenci("Mustafa")};

//        CharYazdir.yazdir(characters);
//        System.out.println("************");
//        IntYazdir.yazdir(integers);
//        System.out.println("************");
//        StringYazdir.yazdir(strings);
//        System.out.println("************");
//        OgrenciYazdir.yazdir(ogrenci);

        YazdirmaSinifi<Character> characterYazdirmaSinifi = new YazdirmaSinifi<>();
        YazdirmaSinifi<Integer> integerYazdirmaSinifi = new YazdirmaSinifi<>();
        YazdirmaSinifi<String> stringYazdirmaSinifi = new YazdirmaSinifi<>();
        YazdirmaSinifi<Ogrenci> ogrenciYazdirmaSinifi = new YazdirmaSinifi<>();

        characterYazdirmaSinifi.yazdir(characters);
        System.out.println("************");
        integerYazdirmaSinifi.yazdir(integers);
        System.out.println("************");
        stringYazdirmaSinifi.yazdir(strings);
        System.out.println("************");
        ogrenciYazdirmaSinifi.yazdir(ogrenci);
    }
}

class Ogrenci {

    private String isim;

    public Ogrenci(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "İsim : " + isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

class CharYazdir {

    public static void yazdir(Character[] dizi) {
        for (Character c : dizi)
            System.out.println(c);
    }
}

class IntYazdir {

    public static void yazdir(Integer[] dizi) {
        for (Integer i : dizi)
            System.out.println(i);
    }
}

class StringYazdir {

    public static void yazdir(String[] dizi) {
        for (String s : dizi)
            System.out.println(s);
    }
}

class OgrenciYazdir {

    public static void yazdir(Ogrenci[] dizi) {
        for (Ogrenci o : dizi)
            System.out.println(o);
    }
}

class YazdirmaSinifi<E> {   // generic class

    public void yazdir(E[] dizi) {
        for (E e : dizi)
            System.out.println(e);
    }
}