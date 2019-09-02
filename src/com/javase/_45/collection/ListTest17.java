package com.javase._45.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest17 {

    public static void main(String[] args) {

        List<Tester> testerList = new ArrayList<>();

        testerList.add(new Tester("Yusuf", 5));
        testerList.add(new Tester("Emre", 1));
        testerList.add(new Tester("Murat", 6));
        testerList.add(new Tester("Oğuz", 10));

        System.out.println("---Küçükten Büyüğe ID Sıralama---");
        Collections.sort(testerList, new KucuktenBuyugeTester());

        for (Tester t : testerList)
            System.out.println(t);

        System.out.println("---Büyükten Küçüğe ID Sıralama---");
        Collections.sort(testerList, new BuyuktenKucugeTester());

        for (Tester t : testerList)
            System.out.println(t);

        System.out.println("---Küçükten Büyüğe String Sıralama---");
        Collections.sort(testerList, new KucuktenBuyugeString());

        for (Tester t : testerList)
            System.out.println(t);

        System.out.println("---Büyükten Küçüğe String Sıralama---");
        Collections.sort(testerList, new Comparator<Tester>() {
            @Override
            public int compare(Tester o1, Tester o2) {
                return -o1.getIsim().compareTo(o2.getIsim());
            }
        });

        for (Tester t : testerList)
            System.out.println(t);
    }
}

class Tester {
    private String isim;
    private int id;

    public Tester(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID : " + id + " ---> İsim : " + isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class KucuktenBuyugeTester implements Comparator<Tester> {

    @Override
    public int compare(Tester o1, Tester o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return 1;
        }
        return 0;
    }
}

class BuyuktenKucugeTester implements Comparator<Tester> {

    @Override
    public int compare(Tester o1, Tester o2) {
        if (o1.getId() < o2.getId()) {
            return 1;
        } else if (o1.getId() > o2.getId()) {
            return -1;
        }
        return 0;
    }
}

class KucuktenBuyugeString implements Comparator<Tester> {

    @Override
    public int compare(Tester o1, Tester o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }
}