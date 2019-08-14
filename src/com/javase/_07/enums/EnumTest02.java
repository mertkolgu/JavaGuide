package com.javase._07.enums;

public class EnumTest02 {

    public static void main(String[] args) {

        CoffeeSize coffeeSize = CoffeeSize.SHORT;

        System.out.println(coffeeSize.getPrice());
        System.out.println(coffeeSize.ordinal());

        for (CoffeeSize cs : CoffeeSize.values())
            System.out.println(cs + " ," + cs.getPrice());
    }
}