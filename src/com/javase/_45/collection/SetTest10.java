package com.javase._45.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest10 {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Java");
        set1.add("C++");
        set1.add("Ptyhon");
        set1.add("JavaScript");
        set1.add("PHP");

        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");

        Set<String> fark = new HashSet<>(set2);
        Set<String> kesisim = new HashSet<>(set2);

        // fark set'ini set2'ye eşitliyoruz
        // fark kümesinde set1 kümesi arasında farklı olanları buluyoruz
        // fark kümesinde hangi karakterler farklı ise onları ekrana basıyoruz
        // çıkan küme boş küme ise false, boş küme değil ise true döner
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);   // [CSS, Go]

        // kesişim set'ini set2'ye eşitliyoruz
        // kesişim kümesi ile set1 kümesinde kesişen elemanları buluyoruz
        // kesişim kümesinde hangi elemanlar kesişiyorsa onları ekrana basıyoruz
        // kesişim varsa true, yoksa false döner
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);
    }
}