package com.javase._45.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListTest15 {

    public static void main(String[] args) {

        List<Gamer> gamerList = new ArrayList<>();

        gamerList.add(new Gamer("Mert", 5));
        gamerList.add(new Gamer("Emre", 1));
        gamerList.add(new Gamer("Murat", 6));
        gamerList.add(new Gamer("Oğuz", 10));

        Collections.sort(gamerList);

        System.out.println("---ArrayList Sıralama---");
        for (Gamer g : gamerList)
            System.out.println(g);

        Set<Gamer> gamerSet = new TreeSet<>();

        gamerSet.add(new Gamer("Mert", 5));
        gamerSet.add(new Gamer("Emre", 1));
        gamerSet.add(new Gamer("Murat", 6));
        gamerSet.add(new Gamer("Oğuz", 10));

        System.out.println("---TreeSet Sıralama---");
        for (Gamer g : gamerSet)
            System.out.println(g);
    }
}

class Gamer implements Comparable<Gamer> {
    private String isim;
    private int id;

    public Gamer(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID : " + id + " ---> İsim : " + isim;
    }

    // kendi objelerimizi kendi class'larımızı kendimiz karşılaştırmak istiyorsak
    // Comparable interface'sinin içindeki compareTo methodunu override etmemiz gerekiyor
    @Override
    public int compareTo(Gamer gamer) {
        // id'ye göre küçükten büyüğe sıralama yapar
        if (this.id < gamer.id) {
            return -1;
        } else if (this.id > gamer.id) {
            return 1;
        }
        return 0;

        // id'ye göre büyükten küçüğe sıralama yapar
        // if (this.id > gamer.id) {
        //     return -1;
        // } else if (this.id < gamer.id) {
        //     return 1;
        // }
        // return 0;
    }
}