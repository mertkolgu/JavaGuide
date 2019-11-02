package com.javase._50.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest04 {
    // Generics yapısında ? extends
    // ? super
    public static void main(String[] args) {
        List<Animal1> animalList = new ArrayList<>();
        List<Dog1> dogList = new ArrayList<>();
        List<Cat1> catList = new ArrayList<>();

        listRuleV2(animalList);
        listRuleV2(dogList);
        listRuleV2(catList);
    }

    public static void listRuleV2(List<? extends Animal1> animalList) {
        // animalList.add(new Animal1());
        // animalList.add(new Dog1());
        // ? extends Animal olduğunda yeni bir eleman eklemeye izin vermez!
        animalList.add(null);   // sadece null eklenebilir.
    }

    // NOT: ? extends ... yeni eleman eklenmesine izin vermez.
    // NOT2: ? implements diye bir şey yoktur. Interface de olsa yine ? extends ifadesi kullanılır.
}

class Animal1 {
    //
}

class Dog1 extends Animal1 {
    //
}

class Kangal extends Dog1 {
    //
}

class Cat1 extends Animal1 {
    //
}
