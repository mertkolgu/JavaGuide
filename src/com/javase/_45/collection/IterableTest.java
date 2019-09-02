package com.javase._45.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableTest {

    public static void main(String[] args) {

        String[] kanallar = {"Radyo Viva", "Radyo Fenomen", "Kral Pop", "Radyo Hacettepe", "Alem FM"};
        Radyo radyo = new Radyo(kanallar);

        // for (String s : radyo)
        //     System.out.println(s);

        Iterator<String> iterator = radyo.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Radyo implements Iterable<String> {

    private ArrayList<String> kanalListesi = new ArrayList<>();

    public Radyo(String[] kanallar) {
        for (String kanal : kanallar)
            System.out.println(kanal);
    }

    @Override
    public Iterator<String> iterator() {
        return new RadyoIterator();
    }

    public class RadyoIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < kanalListesi.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            String deger = kanalListesi.get(index);
            index++;
            return deger;
        }
    }
}