package com.javase._48.anonymousinnerclass;

class PopCorn {

    public void pop() {
        System.out.println("popcorn");
    }
}

class Food {

    // anonymous class!!!
    PopCorn p = new PopCorn() {
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };

    PopCorn p2 = new PopCorn();
}