package com.javase._50.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest05 {

    public static void main(String[] args) {
        List<Animal1> animalList = new ArrayList<>();
        List<Dog1> dogList = new ArrayList<>();
        List<Kangal> kangalList = new ArrayList<>();
        List<Cat1> catList = new ArrayList<>();

        listRuleV3(animalList);
        listRuleV3(dogList);
        listRuleV3(kangalList);
        // listRuleV3(catList); // compile error

        System.out.println(dogList.size()); // 1
        System.out.println(animalList.size());  // 1
        System.out.println(kangalList.size());  // 1

        System.out.println(dogList);
        System.out.println(animalList);
        System.out.println(kangalList);
    }

    // ? super Kangal
    public static void listRuleV3(List<? super Kangal> list) {
        list.add(new Kangal());
        // list.add(new Animal());  // compile error

        // List<Dog1>
        // List<Kangal> bu metoda gelebilir.
        // Kangal IS-A Animal
    }
}
